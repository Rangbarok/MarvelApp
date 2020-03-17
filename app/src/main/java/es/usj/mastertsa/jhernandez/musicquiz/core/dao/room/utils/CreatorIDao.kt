package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.utils

import androidx.room.*
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CreatorRoom

@Dao
interface CreatorIDao {

    @Insert
    fun insert(comic: CreatorRoom?)

    @Query("DELETE FROM creators")
    fun deleteAll()

    @Delete
    fun delete(comic: CreatorRoom?)

    @Query("SELECT * from comics WHERE id = :id")
    fun findById(id: Long): CreatorRoom

    @Query("SELECT * from comics ORDER BY id ASC")
    fun getAllEvents(): List<CreatorRoom>

    @Update
    fun update(event: CreatorRoom?)
}