package es.usj.mastertsa.jhernandez.musicquiz.core

import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.ComicRoom
import es.usj.mastertsa.jhernandez.musicquiz.core.factories.RoomDaoFactory

enum class DatasourceType {
    ROOM
}

abstract class DaoFactory {

    companion object {

        var DATASOURCE = DatasourceType.ROOM

        fun getFactory() : DaoFactory {
            return when(DATASOURCE) {
                DatasourceType.ROOM -> RoomDaoFactory()
            }
        }
    }

    abstract fun getComicDao(): IDao<ComicRoom>
}