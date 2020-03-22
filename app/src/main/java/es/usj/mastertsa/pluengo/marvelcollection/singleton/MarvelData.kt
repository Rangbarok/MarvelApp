package es.usj.mastertsa.pluengo.marvelcollection.singleton

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import es.usj.mastertsa.pluengo.marvelcollection.client.ApiClient
import es.usj.mastertsa.pluengo.marvelcollection.client.api.DefaultApi
import es.usj.mastertsa.pluengo.marvelcollection.client.auth.MarvelAuth
import es.usj.mastertsa.pluengo.marvelcollection.client.model.Comic
import es.usj.mastertsa.pluengo.marvelcollection.core.DaoFactory
import es.usj.mastertsa.pluengo.marvelcollection.core.IDao
import es.usj.mastertsa.pluengo.marvelcollection.model.ComicRoom
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.doAsyncResult
import java.net.URL
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

interface InterfaceRefreshList {
    fun refreshListRequest()
}

object MarvelData {
    var daoComics : IDao<ComicRoom> = DaoFactory.getFactory().getComicDao()

    private val signAPIPresenter =
        SignPresenter()

    private var marvelRequestInterceptor: MarvelAuth? = null
    private var apiClient: ApiClient? = null
    private var marvelServiceApi: DefaultApi? = null

    private var currentOffset = 0
    private var currentLimit = 25

    var refreshListListeners = ArrayList<InterfaceRefreshList>()

    private val observer = { _: KProperty<*>, _: Any, _: Any ->
        refreshListListeners.forEach {
            it.refreshListRequest()
        }
    }

    var comicsAPI: ArrayList<Comic> by Delegates.observable(arrayListOf<Comic>(), observer)
    var comicsRoom: ArrayList<ComicRoom>? = null

    fun buildMarvelServiceAPI() {
        signAPIPresenter.sign("867ef9fe67a6ded32323fa5824f03945", "1581706782", "e49d2084fd36c2d43967ef056eee2ab8")
        if (signAPIPresenter.isSigned) {
            marvelRequestInterceptor = MarvelAuth(
                signAPIPresenter.timestamp,
                signAPIPresenter.publicToken,
                signAPIPresenter.hash
            ).apply { limit = 25 }

            apiClient = ApiClient().apply { addAuthorization("MarvelLibApp", marvelRequestInterceptor) }

            marvelServiceApi = apiClient!!.buildClient(DefaultApi::class.java)

            getComicsFromCache { comics ->
                comicsRoom = comics

                if (comicsRoom != null && currentOffset == 0) {
                    currentOffset += comicsRoom?.size!!
                }
            }
        }
    }

    fun cleanMarvelServiceAPI() {
        marvelRequestInterceptor = null
        apiClient = null
        marvelServiceApi = null
        signAPIPresenter.unsign()
    }

    private fun getComicsFromCache(callback: (ArrayList<ComicRoom>) -> Unit) {
        doAsyncResult {
            val auxComics = daoComics.list()
            callback(auxComics as ArrayList<ComicRoom>)
        }
    }

    fun getNextComicsFromAPI() {
        if (signAPIPresenter.isSigned) {
            marvelRequestInterceptor!!.offset = currentOffset
            currentOffset += currentLimit

            doAsyncResult {
                val auxComics = comicsAPI
                val comicsToAdd = marvelServiceApi!!.getComicsCollection(mapOf()).data?.results as ArrayList<Comic>
                auxComics.addAll(comicsToAdd)
                comicsAPI = auxComics
                comicsAPI.forEach {
                    if(!comicIsInCache(it.digitalId!!) && it.digitalId != null && it.description != null && it.title !== null && it.characters != null && it.creators != null && it.thumbnail != null) {
                        storeComicsInCache(it)
                    }
                }
            }
        }
    }

    fun getAPICoverImage(comicThumbnailPath: String, comicThumbnailExtension: String): Bitmap? {
        return if (signAPIPresenter.isSigned) {
            val url: URL = URL("$comicThumbnailPath/portrait_fantastic.$comicThumbnailExtension")
            BitmapFactory.decodeStream(url.openConnection().getInputStream())
        } else {
            null
        }
    }

    private fun storeComicsInCache(comic: Comic) {
        val comicRoom =
            ComicRoom(
                comic.digitalId,
                comic.title,
                comic.description,
                comic.characters?.items?.size,
                comic.creators?.items?.size,
                comic.thumbnail?.path,
                comic.thumbnail?.extension
            )
        daoComics.insert(comicRoom)
    }

    private fun comicIsInCache(digitalId: Int): Boolean {
        val comicRoom = daoComics.findById(digitalId)
        return comicRoom != null
    }

    fun clearCache() {
        doAsync {
            daoComics.list().forEach {
                daoComics.delete(it.digitalId!!)
            }
        }
    }

}