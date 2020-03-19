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

    var comics: ArrayList<Comic> by Delegates.observable(arrayListOf<Comic>(), observer)

    fun buildMarvelServiceAPI() {
        signAPIPresenter.sign("867ef9fe67a6ded32323fa5824f03945", "1581706782", "e49d2084fd36c2d43967ef056eee2ab8")
        if (signAPIPresenter.isSigned) {
            marvelRequestInterceptor = MarvelAuth(signAPIPresenter.timestamp, signAPIPresenter.publicToken, signAPIPresenter.hash)

            apiClient= ApiClient().apply {
                addAuthorization("MarvelLibApp", marvelRequestInterceptor)
            }

            marvelServiceApi = apiClient!!.buildClient(DefaultApi::class.java)
        }
    }

    fun cleanMarvelServiceAPI() {
        marvelRequestInterceptor = null
        apiClient = null
        marvelServiceApi = null
        signAPIPresenter.unsign()
    }

    fun getNextComicsFromAPI() {
        if (signAPIPresenter.isSigned) {
            marvelRequestInterceptor!!.limit =
                currentLimit
            marvelRequestInterceptor!!.offset =
                currentOffset
            currentOffset += currentLimit
            doAsyncResult {
                val auxComics = marvelServiceApi!!.getComicsCollection(mapOf()).data?.results as ArrayList<Comic>
                Log.e("MARVEL_APP", "OLD SIZE :: ${comics.size}")
                // TODO: HOW TO DETECT ARRAY CHANGES IN addAll
                comics.addAll(auxComics)
                val totalComic = comics
                comics = totalComic
                Log.e("MARVEL_APP", "NEW SIZE :: ${comics.size}")
                //comics.clear()
                //comics.addAll(marvelServiceApi!!.getComicsCollection(mapOf()).data?.results as ArrayList<Comic>)
                // TODO: store comics in cache before end function
                /*comics.forEach {
                    storeComicsInCache(it)
                }*/
            }
        }
    }

    fun getAPICoverImage(comic: Comic): Bitmap? {
        return if (signAPIPresenter.isSigned) {
            val url: URL = URL("${comic.thumbnail?.path}/portrait_fantastic.${comic.thumbnail?.extension}")
            BitmapFactory.decodeStream(url.openConnection().getInputStream())
        } else {
            null
        }
    }

    fun getAPICreator(id: Int): Creator? {
        return if (signAPIPresenter.isSigned) {
            marvelServiceApi!!.getCreatorIndividual(id).data?.results?.first()
        } else {
            null
        }
    }

    fun getAPIComic(id: Int): Comic? {
        return if (signAPIPresenter.isSigned) {
            marvelServiceApi!!.getComicIndividual(id).data?.results?.first()
        } else {
            null
        }
    }

    fun getComicsFromCache(): List<ComicRoom>? {
        return if (daoComics.list().isNotEmpty()) {
            daoComics.list()
        } else {
            null
        }
    }

    /*fun storeComicsInCache(comic: Comic) {
        val comicRoom = ComicRoom(comic.id!!.toLong(), comic.title!!, comic.pageCount!!, comic.characters!!.items!!.size, comic.creators!!.items!!.size)
        daoComics.insert(comicRoom)
    }*/

    fun clearCache() {

    }

}