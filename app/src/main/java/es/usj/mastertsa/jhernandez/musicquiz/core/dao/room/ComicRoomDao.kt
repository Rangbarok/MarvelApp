package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room

import es.usj.mastertsa.jhernandez.musicquiz.MainActivity
import es.usj.mastertsa.jhernandez.musicquiz.core.IDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.ComicRoom
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.utils.ComicIDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.utils.ComicRoomDatabase

class ComicRoomDao() : IDao<ComicRoom> {

    var comicIDao: ComicIDao? = null

    init {
        comicIDao = ComicRoomDatabase.getDatabase(MainActivity.ctx!!)!!.comicDao()
    }

    override fun insert(element: ComicRoom): ComicRoom {
        comicIDao!!.insert(element)
        return element
    }

    override fun update(element: ComicRoom): Long? {
        comicIDao!!.update(element)
        return 1
    }

    override fun delete(id: Long): ComicRoom? {
        val event = findById(id)
        comicIDao!!.delete(event)
        return event
    }

    override fun list(): List<ComicRoom> {
        return comicIDao!!.getAllEvents()
    }

    override fun findById(id: Long): ComicRoom? {
        return comicIDao!!.findById(id)
    }


}