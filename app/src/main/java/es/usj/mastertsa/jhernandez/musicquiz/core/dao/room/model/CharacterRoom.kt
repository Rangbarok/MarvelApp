package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "characters")
data class CharacterRoom(@PrimaryKey var id: String,
                         val name: String) {

    override fun toString(): String {
        return "$id.- $name"
    }
}