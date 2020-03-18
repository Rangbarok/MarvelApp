package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "creators")
data class CreatorRoom(@PrimaryKey var id: String,
                       val name: String) {

    override fun toString(): String {
        return "$id.- $name"
    }
}