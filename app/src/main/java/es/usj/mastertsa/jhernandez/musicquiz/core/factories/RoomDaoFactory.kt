package es.usj.mastertsa.jhernandez.musicquiz.core.factories

import es.usj.mastertsa.jhernandez.musicquiz.core.DaoFactory
import es.usj.mastertsa.jhernandez.musicquiz.core.IDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.CharacterRoomDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.ComicRoomDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.CreatorRoomDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CharacterRoom
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.ComicRoom
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CreatorRoom


class RoomDaoFactory : DaoFactory() {

    override fun getComicDao(): IDao<ComicRoom> {
        return ComicRoomDao()
    }

    override fun getCharacterDao(): IDao<CharacterRoom> {
        return CharacterRoomDao()
    }

    override fun getCreatorDao(): IDao<CreatorRoom> {
        return CreatorRoomDao()
    }
}