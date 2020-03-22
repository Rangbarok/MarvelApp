package es.usj.mastertsa.pluengo.marvelcollection

import es.usj.mastertsa.pluengo.marvelcollection.client.model.Comic
import es.usj.mastertsa.pluengo.marvelcollection.core.dao.room.model.ComicRoom
import java.io.Serializable

data class GeneralComic(
    var id: Int,
    var title: String,
    var description: String,
    var numberOfCharacter: Int,
    var numberOfCreators: Int,
    var thumbnailPath: String,
    var thumbnailExtension: String
): Serializable {
    constructor(comic: Comic) : this(comic.id!!, comic.title!!, comic.description!!, comic.characters!!.items!!.size, comic.creators!!.items!!.size, comic.thumbnail!!.path!!, comic.thumbnail!!.extension!!)
    constructor(comic: ComicRoom) : this(comic.id.toInt(), comic.title, comic.description, comic.numberOfCharacter, comic.numberOfCreators, comic.comicThumbnailPath, comic.comicThumbnailExtension)
}