package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.utils

import androidx.room.TypeConverter
import es.usj.mastertsa.jhernandez.musicquiz.MainActivity
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.ComicRoom
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.utils.ComicRoomDatabase
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
    fun fromId(value: Long?): ComicRoom? {
        return ComicRoomDatabase.getDatabase(MainActivity.ctx!!)!!.placeDao()!!.findById(value!!)
    }

    @TypeConverter
    fun placeTo(comic: ComicRoom?): Long? {
        return comic?.id
    }
}