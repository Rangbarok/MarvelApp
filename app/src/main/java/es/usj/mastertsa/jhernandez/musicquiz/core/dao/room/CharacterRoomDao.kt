package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room

import es.usj.mastertsa.jhernandez.musicquiz.MainActivity
import es.usj.mastertsa.jhernandez.musicquiz.core.IDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.utils.CharacterIDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.utils.ComicRoomDatabase

class CharacterRoomDao() : IDao<es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CharacterRoom> {

    var characterIDao: CharacterIDao? = null

    init {
        characterIDao = ComicRoomDatabase.getDatabase(MainActivity.ctx!!)!!.characterDao()
    }

    override fun insert(element: es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CharacterRoom): es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CharacterRoom {
        characterIDao!!.insert(element)
        return element
    }

    override fun update(element: es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CharacterRoom): Long? {
        characterIDao!!.update(element)
        return 1
    }

    override fun delete(id: Long): es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CharacterRoom? {
        val event = findById(id)
        characterIDao!!.delete(event)
        return event
    }

    override fun list(): List<es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CharacterRoom> {
        return characterIDao!!.getAllEvents()
    }

    override fun findById(id: Long): es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CharacterRoom? {
        return characterIDao!!.findById(id)
    }


}