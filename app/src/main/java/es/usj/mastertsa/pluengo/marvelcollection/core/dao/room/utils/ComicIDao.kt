package es.usj.mastertsa.pluengo.marvelcollection.core.dao.room.utils

import androidx.room.*
import es.usj.mastertsa.pluengo.marvelcollection.core.dao.room.model.ComicRoom

@Dao
interface ComicIDao {

    @Insert
    fun insert(comic: ComicRoom?)

    @Query("DELETE FROM comics")
    fun deleteAll()

    @Delete
    fun delete(comic: ComicRoom?)

    @Query("SELECT * from comics WHERE id = :id")
    fun findById(id: Long): ComicRoom

    @Query("SELECT * from comics ORDER BY id ASC")
    fun getAllComics(): List<ComicRoom>

    @Update
    fun update(event: ComicRoom?)
}