package es.usj.mastertsa.pluengo.marvelcollection.core.dao.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comics")
data class ComicRoom(@PrimaryKey var id: Long,
                     val title: String = "No title",
                     val description: String = "No description",
                     val numberOfCharacter: Int = 0,
                     val numberOfCreators: Int = 0,
                     val comicThumbnailPath: String,
                     val comicThumbnailExtension: String) {

    override fun toString(): String {
        return "$id.- $title"
    }
}