package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.utils

import androidx.room.*
import es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model.CharacterRoom

@Dao
interface CharacterIDao {

    @Insert
    fun insert(comic: CharacterRoom?)

    @Query("DELETE FROM characters")
    fun deleteAll()

    @Delete
    fun delete(comic: CharacterRoom?)

    @Query("SELECT * from comics WHERE id = :id")
    fun findById(id: Long): CharacterRoom

    @Query("SELECT * from comics ORDER BY id ASC")
    fun getAllEvents(): List<CharacterRoom>

    @Update
    fun update(event: CharacterRoom?)
}