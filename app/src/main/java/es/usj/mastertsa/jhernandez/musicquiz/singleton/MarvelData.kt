package es.usj.mastertsa.jhernandez.musicquiz.singleton

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import es.usj.mastertsa.jhernandez.musicquiz.MainActivity
import es.usj.mastertsa.jhernandez.musicquiz.client.ApiClient
import es.usj.mastertsa.jhernandez.musicquiz.client.api.DefaultApi
import es.usj.mastertsa.jhernandez.musicquiz.client.auth.MarvelAuth
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Comic
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Creator
import es.usj.mastertsa.jhernandez.musicquiz.core.DaoFactory
import es.usj.mastertsa.jhernandez.musicquiz.core.IDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.ComicRoom
import java.net.URL
import kotlin.coroutines.coroutineContext

object MarvelData {
    lateinit var dao : IDao<ComicRoom>

    init {
        dao = DaoFactory.getFactory().getComicDao()
    }


    private const val publicToken = "867ef9fe67a6ded32323fa5824f03945"
    private const val temporalTimeStamp = "1581706782"
    private const val temporalHash = "e49d2084fd36c2d43967ef056eee2ab8"

    private var marvelRequestInterceptor = MarvelAuth(
        temporalTimeStamp,
        publicToken,
        temporalHash
    )
    private val apiClient
        get () = ApiClient().apply {
            addAuthorization("MarvelLibApp",
                marvelRequestInterceptor
            )
        }
    private var marvelServiceApi = apiClient.buildClient(DefaultApi::class.java)

    private var currentOffset = 0
    private var currentLimit = 20

    var comics: ArrayList<Comic>? = null

    fun getNextComicsFromAPI() {
        marvelRequestInterceptor.limit =
            currentLimit
        marvelRequestInterceptor.offset =
            currentOffset
        currentOffset += currentLimit
        comics = marvelServiceApi.getComicsCollection(mapOf()).data?.results as ArrayList<Comic>
    }

    fun getAPICoverImage(comic: Comic): Bitmap {
        val url: URL = URL("${comic.thumbnail?.path}/portrait_fantastic.${comic.thumbnail?.extension}")
        return BitmapFactory.decodeStream(url.openConnection().getInputStream())
    }

    fun getAPICreator(id: Int): Creator? {
        return marvelServiceApi.getCreatorIndividual(id).data?.results?.first()
    }

    fun getAPIComic(id: Int): Comic? {
        return marvelServiceApi.getComicIndividual(id).data?.results?.first()
    }


    fun getComicsFromCache() {
        dao.list()
    }

    fun storeComicInCache(comic: Comic) {

    }

    fun clearCache() {

    }

}