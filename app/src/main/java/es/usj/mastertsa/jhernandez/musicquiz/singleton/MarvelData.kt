package es.usj.mastertsa.jhernandez.musicquiz.singleton

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import es.usj.mastertsa.jhernandez.musicquiz.client.ApiClient
import es.usj.mastertsa.jhernandez.musicquiz.client.api.DefaultApi
import es.usj.mastertsa.jhernandez.musicquiz.client.auth.MarvelAuth
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Comic
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Creator
import es.usj.mastertsa.jhernandez.musicquiz.core.DaoFactory
import es.usj.mastertsa.jhernandez.musicquiz.core.IDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.ComicRoom
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

    private val signAPIPresenter = SignPresenter()

    private var marvelRequestInterceptor: MarvelAuth? = null
    private var apiClient: ApiClient? = null
    private var marvelServiceApi: DefaultApi? = null

    private var currentOffset = 0
    private var currentLimit = 20

    var refreshListListeners = ArrayList<InterfaceRefreshList>()

    private val observer = { _: KProperty<*>, _: Any, _: Any ->
        refreshListListeners.forEach {
            it.refreshListRequest()
        }
    }

    var comicsAPI: ArrayList<Comic> by Delegates.observable(arrayListOf<Comic>(), observer)

    var comicsRoom: ArrayList<ComicRoom>? = null

    var numberOfComicsInRoom: Int = 0

    fun buildMarvelServiceAPI() {
        signAPIPresenter.sign("867ef9fe67a6ded32323fa5824f03945", "1581706782", "e49d2084fd36c2d43967ef056eee2ab8")
        if (signAPIPresenter.isSigned) {
            marvelRequestInterceptor = MarvelAuth(signAPIPresenter.timestamp, signAPIPresenter.publicToken, signAPIPresenter.hash)

            apiClient= ApiClient().apply {
                addAuthorization("MarvelLibApp", marvelRequestInterceptor)
            }

            marvelServiceApi = apiClient!!.buildClient(DefaultApi::class.java)

            getComicsFromCache { comics ->
                comicsRoom = comics

                if (comicsRoom != null) {
                    numberOfComicsInRoom = comicsRoom?.size!!
                    currentOffset += numberOfComicsInRoom
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

    private fun formatComics(comics: ArrayList<Comic>): ArrayList<Comic> {
        val newComics = arrayListOf<Comic>()
        comics.forEach {
            if (it.id != null && it.characters != null && it.creators != null && it.title != null && it.description != null && it.thumbnail != null && it.thumbnail!!.path != null && it.thumbnail!!.extension != null) {
                newComics.add(it)
            }
        }
        return newComics
    }

    fun getNextComicsFromAPI() {
        if (signAPIPresenter.isSigned) {
            marvelRequestInterceptor!!.limit =
                currentLimit
            marvelRequestInterceptor!!.offset =
                currentOffset
            currentOffset += currentLimit

            doAsyncResult {
                val auxComics = comicsAPI
                val comicsToAdd = formatComics(marvelServiceApi!!.getComicsCollection(mapOf()).data?.results as ArrayList<Comic>)
                auxComics.addAll(comicsToAdd)
                comicsAPI = auxComics
                comicsAPI.forEach {
                    if(!comicIsInCache(it.id!!.toLong()) && it.id != null && it.description != null && it.title !== null && it.characters != null && it.creators != null && it.thumbnail != null) {
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
        val comicRoom = ComicRoom(comic.id!!.toLong(), comic.title!!, comic.description!!, comic.characters?.items!!.size, comic.creators?.items!!.size, comic.thumbnail?.path!!, comic.thumbnail?.extension!!)
        daoComics.insert(comicRoom)
    }

    private fun comicIsInCache(id: Long): Boolean {
        val comicRoom = daoComics.findById(id)
        return comicRoom != null
    }

    fun clearCache() {
        doAsync {
            daoComics.list().forEach {
                daoComics.delete(it.id)
            }
        }
    }

}