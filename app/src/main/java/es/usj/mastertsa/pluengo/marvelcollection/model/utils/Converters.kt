package es.usj.mastertsa.pluengo.marvelcollection.model.utils

import androidx.room.TypeConverter
import es.usj.mastertsa.pluengo.marvelcollection.controller.comicList.MainActivity
import es.usj.mastertsa.pluengo.marvelcollection.model.ComicRoom
import es.usj.mastertsa.pluengo.marvelcollection.core.dao.room.utils.MarvelRoomDatabase
import java.util.*

class Converters {

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }

    @TypeConverter
    fun comicFromId(value: Int?): ComicRoom? {
        return MarvelRoomDatabase.getDatabase(
            MainActivity.ctx!!)!!.comicDao()!!.findById(value!!)
    }

    @TypeConverter
    fun comicToId(comic: ComicRoom?): Int? {
        return comic?.digitalId
    }
}