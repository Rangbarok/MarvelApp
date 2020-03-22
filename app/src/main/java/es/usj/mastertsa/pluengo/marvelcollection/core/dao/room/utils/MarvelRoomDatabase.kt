package es.usj.mastertsa.pluengo.marvelcollection.core.dao.room.utils

import android.content.Context
import androidx.room.*
import es.usj.mastertsa.pluengo.marvelcollection.core.dao.room.model.ComicRoom
import es.usj.mastertsa.pluengo.marvelcollection.core.dao.room.model.utils.Converters

@Database(
    entities = [ComicRoom::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class MarvelRoomDatabase : RoomDatabase() {

    abstract fun comicDao(): ComicIDao?

    companion object {
        private val sRoomDatabaseCallback: Callback =
            object : Callback() { }

        @Volatile
        private var INSTANCE: MarvelRoomDatabase? = null

        fun getDatabase(context: Context): MarvelRoomDatabase? {
            if (INSTANCE == null) {
                synchronized(MarvelRoomDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE =
                            Room.databaseBuilder(
                                    context.applicationContext,
                                    MarvelRoomDatabase::class.java, "roomEvents"
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