package es.usj.mastertsa.pluengo.marvelcollection.core.factories

import es.usj.mastertsa.pluengo.marvelcollection.core.DaoFactory
import es.usj.mastertsa.pluengo.marvelcollection.core.IDao
import es.usj.mastertsa.pluengo.marvelcollection.core.dao.room.ComicRoomDao
import es.usj.mastertsa.pluengo.marvelcollection.model.ComicRoom


class RoomDaoFactory : DaoFactory() {

    override fun getComicDao(): IDao<ComicRoom> {
        return ComicRoomDao()
    }
}