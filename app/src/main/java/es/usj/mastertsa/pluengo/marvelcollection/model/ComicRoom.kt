package es.usj.mastertsa.pluengo.marvelcollection.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigInteger
import java.util.*

@Entity(tableName = "comics")
data class ComicRoom(@PrimaryKey var digitalId: Int? = BigInteger(UUID.randomUUID().toString()).toInt(),
                     val title: String? = "No title",
                     val description: String? = "No description",
                     val numberOfCharacter: Int? = 0,
                     val numberOfCreators: Int? = 0,
                     val comicThumbnailPath: String? = "http://i.annihil.us/u/prod/marvel/i/mg/3/40/4bb4680432f73",
                     val comicThumbnailExtension: String? = "jpg") {

    override fun toString(): String {
        return "$digitalId.- $title"
    }
}