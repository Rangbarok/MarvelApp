package es.usj.mastertsa.jhernandez.musicquiz.singleton

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import es.usj.mastertsa.jhernandez.musicquiz.client.ApiClient
import es.usj.mastertsa.jhernandez.musicquiz.client.api.DefaultApi
import es.usj.mastertsa.jhernandez.musicquiz.client.auth.MarvelAuth
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Comic
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Creator
import es.usj.mastertsa.jhernandez.musicquiz.core.DaoFactory
import es.usj.mastertsa.jhernandez.musicquiz.core.IDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CharacterRoom
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.ComicRoom
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CreatorRoom
import org.jetbrains.anko.doAsync
import java.net.URL

object MarvelData {
    var daoComics : IDao<ComicRoom> = DaoFactory.getFactory().getComicDao()
    var daoCreators : IDao<CreatorRoom> = DaoFactory.getFactory().getCreatorDao()
    var daoCharacters : IDao<CharacterRoom> = DaoFactory.getFactory().getCharacterDao()

    private val signAPIPresenter = SignPresenter()

    /*private const val publicToken = "867ef9fe67a6ded32323fa5824f03945"
    private const val temporalTimeStamp = "1581706782"
    private const val temporalHash = "e49d2084fd36c2d43967ef056eee2ab8"*/

    private var marvelRequestInterceptor: MarvelAuth? = null
    private var apiClient: ApiClient? = null
    private var marvelServiceApi: DefaultApi? = null

    private var currentOffset = 0
    private var currentLimit = 20

    var comics: ArrayList<Comic>? = null

    fun buildMarvelServiceAPI(publicToken: String = "867ef9fe67a6ded32323fa5824f03945", timestamp: String = "1581706782", hash: String = "e49d2084fd36c2d43967ef056eee2ab8") {
        signAPIPresenter.sign(publicToken, timestamp, hash)
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
            comics = marvelServiceApi!!.getComicsCollection(mapOf()).data?.results as ArrayList<Comic>
            // TODO: store comics in cache before end function
            doAsync {
                comics!!.forEach {
                    storeComicsInCache(it)
                }
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

    fun storeComicsInCache(comic: Comic) {
        val creators: ArrayList<CreatorRoom> = arrayListOf()
        val characters: ArrayList<CharacterRoom> = arrayListOf()

        for (creatorAPI in comic.creators!!.items!!.toList()) {
            val creatorRoom = CreatorRoom(creatorAPI.resourceURI!!, creatorAPI.name!!)
            creators.add(creatorRoom)
            daoCreators.insert(creatorRoom)
        }
        for (characterAPI in comic.characters!!.items!!.toList()) {
            val characterRoom = CharacterRoom(characterAPI.resourceURI!!, characterAPI.name!!)
            characters.add(characterRoom)
            daoCharacters.insert(characterRoom)
        }

        val comicRoom = ComicRoom(comic.id!!.toLong(), comic.title!!, comic.pageCount!!, characters!!, creators!!)
        daoComics.insert(comicRoom)
    }

    fun clearCache() {

    }

}