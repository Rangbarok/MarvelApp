package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "characters")
data class CharacterRoom(@PrimaryKey var id: Long,
                         val name: String,
                         val description: String) {

    override fun toString(): String {
        return "$id.- $name"
    }
}