package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comics")
data class ComicRoom(@PrimaryKey var id: Long,
                     val title: String,
                     val pageCount: Int,
                     val numberOfCharacter: Int,
                     val numberOfCreators: Int) {

    override fun toString(): String {
        return "$id.- $title"
    }
}