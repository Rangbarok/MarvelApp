package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room

import es.usj.mastertsa.jhernandez.musicquiz.MainActivity
import es.usj.mastertsa.jhernandez.musicquiz.core.IDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CreatorRoom
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.utils.ComicRoomDatabase
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.utils.CreatorIDao

class CreatorRoomDao() : IDao<CreatorRoom> {

    var creatorIDao: CreatorIDao? = null

    init {
        creatorIDao = ComicRoomDatabase.getDatabase(MainActivity.ctx!!)!!.creatorDao()
    }

    override fun insert(element: CreatorRoom): CreatorRoom {
        creatorIDao!!.insert(element)
        return element
    }

    override fun update(element: CreatorRoom): Long? {
        creatorIDao!!.update(element)
        return 1
    }

    override fun delete(id: Long): CreatorRoom? {
        val event = findById(id)
        creatorIDao!!.delete(event)
        return event
    }

    override fun list(): List<CreatorRoom> {
        return creatorIDao!!.getAllEvents()
    }

    override fun findById(id: Long): CreatorRoom? {
        return creatorIDao!!.findById(id)
    }


}