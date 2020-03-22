package es.usj.mastertsa.pluengo.marvelcollection.core.dao.room

import es.usj.mastertsa.pluengo.marvelcollection.controller.comicList.MainActivity
import es.usj.mastertsa.pluengo.marvelcollection.core.IDao
import es.usj.mastertsa.pluengo.marvelcollection.model.ComicRoom
import es.usj.mastertsa.pluengo.marvelcollection.core.dao.room.utils.ComicIDao
import es.usj.mastertsa.pluengo.marvelcollection.core.dao.room.utils.MarvelRoomDatabase

class ComicRoomDao() :
    IDao<ComicRoom> {

    var comicIDao: ComicIDao? = null

    init {
        comicIDao = MarvelRoomDatabase.getDatabase(
            MainActivity.ctx!!)!!.comicDao()
    }

    override fun insert(element: ComicRoom): ComicRoom {
        comicIDao!!.insert(element)
        return element
    }

    override fun update(element: ComicRoom): Int? {
        comicIDao!!.update(element)
        return 1
    }

    override fun delete(id: Int): ComicRoom? {
        val event = findById(id)
        comicIDao!!.delete(event)
        return event
    }

    override fun list(): List<ComicRoom> {
        return comicIDao!!.getAllComics()
    }

    override fun findById(id: Int): ComicRoom? {
        return comicIDao!!.findById(id)
    }


}