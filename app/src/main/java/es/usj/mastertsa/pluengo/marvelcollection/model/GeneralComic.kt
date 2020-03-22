package es.usj.mastertsa.pluengo.marvelcollection.model

import es.usj.mastertsa.pluengo.marvelcollection.client.model.Comic
import es.usj.mastertsa.pluengo.marvelcollection.model.ComicRoom
import java.io.Serializable
import java.math.BigInteger
import java.time.Instant
import java.util.*

data class GeneralComic(
    var digitalId: Int? = BigInteger(UUID.randomUUID().toString()).toInt(),
    var title: String? = "No title",
    var description: String? = "No description",
    var numberOfCharacter: Int? = 0,
    var numberOfCreators: Int? = 0,
    var thumbnailPath: String? = "http://i.annihil.us/u/prod/marvel/i/mg/3/40/4bb4680432f73",
    var thumbnailExtension: String? = "jpg"
): Serializable {
    constructor(comic: Comic) : this(comic.digitalId, comic.title, comic.description, comic.characters?.items?.size, comic.creators?.items?.size, comic.thumbnail?.path, comic.thumbnail?.extension)
    constructor(comic: ComicRoom) : this(comic.digitalId, comic.title, comic.description, comic.numberOfCharacter, comic.numberOfCreators, comic.comicThumbnailPath, comic.comicThumbnailExtension)
}