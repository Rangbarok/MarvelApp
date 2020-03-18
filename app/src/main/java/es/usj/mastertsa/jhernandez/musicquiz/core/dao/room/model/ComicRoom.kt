package es.usj.mastertsa.jhernandez.musicquiz.core.dao.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comics")
data class ComicRoom(@PrimaryKey var id: Long,
                     val title: String,
                     val pageCount: Int,
                     val characters: ArrayList<CharacterRoom>,
                     val creators: ArrayList<CreatorRoom>) {

    override fun toString(): String {
        return "$id.- $title"
    }
}