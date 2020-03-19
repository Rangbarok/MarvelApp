package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.utils

import androidx.room.TypeConverter
import es.usj.mastertsa.jhernandez.musicquiz.MainActivity
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.ComicRoom
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.utils.MarvelRoomDatabase
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
    fun comicFromId(value: Long?): ComicRoom? {
        return MarvelRoomDatabase.getDatabase(MainActivity.ctx!!)!!.comicDao()!!.findById(value!!)
    }

    @TypeConverter
    fun comicToId(comic: ComicRoom?): Long? {
        return comic?.id
    }
}