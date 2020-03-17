package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.utils

import android.content.Context
import androidx.room.*
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Character
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Comic
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Creator
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.utils.Converters

@Database(
    entities = [Comic::class, Character::class, Creator::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class ComicRoomDatabase : RoomDatabase() {

    abstract fun comicDao(): ComicIDao?
    abstract fun creatorDao(): CreatorIDao?
    abstract fun characterDao(): CharacterIDao?

    companion object {
        private val sRoomDatabaseCallback: Callback =
            object : Callback() { }

        @Volatile
        private var INSTANCE: ComicRoomDatabase? = null

        fun getDatabase(context: Context): ComicRoomDatabase? {
            if (INSTANCE == null) {
                synchronized(ComicRoomDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE =
                            Room.databaseBuilder(
                                    context.applicationContext,
                                    ComicRoomDatabase::class.java, "roomEvents"
                                )
                                .addCallback(sRoomDatabaseCallback)
                                .build()
                    }
                }
            }
            return INSTANCE
        }
    }
}