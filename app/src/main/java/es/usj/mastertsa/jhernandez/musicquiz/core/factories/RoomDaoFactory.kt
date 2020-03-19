package es.usj.mastertsa.jhernandez.musicquiz.core.factories

import es.usj.mastertsa.jhernandez.musicquiz.core.DaoFactory
import es.usj.mastertsa.jhernandez.musicquiz.core.IDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.ComicRoomDao
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.ComicRoom


class RoomDaoFactory : DaoFactory() {

    override fun getComicDao(): IDao<ComicRoom> {
        return ComicRoomDao()
    }
}