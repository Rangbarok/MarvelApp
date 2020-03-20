package es.usj.mastertsa.jhernandez.musicquiz

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Comic
import es.usj.mastertsa.jhernandez.musicquiz.singleton.MarvelData
import kotlinx.android.synthetic.main.activity_comic_detail.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.net.URL

class ComicDetail : AppCompatActivity() {

    private var comicTitle: String? = null
    private var comicDescription: String? = null
    private var comicNumberCharacters: Int? = null
    private var comicNumberCreators: Int? = null
    private var comicThumbnailPath: String? = null
    private var comicThumbnailExtension: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic_detail)

        comicTitle = intent.extras?.get("comic_title") as String
        comicDescription = intent.extras?.get("comic_description") as String
        comicNumberCharacters = intent.extras?.get("comic_characters_num") as Int
        comicNumberCreators = intent.extras?.get("comic_creators_num") as Int
        comicThumbnailExtension = intent.extras?.get("comic_thumbnail_extension") as String
        comicThumbnailPath = intent.extras?.get("comic_thumbnail_path") as String

        tvComicTitle.text = comicTitle
        tvCreators.text = comicNumberCreators.toString()
        tvCharacters.text = comicNumberCharacters.toString()
        tvDescirption.text = comicDescription
        doAsync {
            val bmp = MarvelData.getAPICoverImage(comicThumbnailPath!!, comicThumbnailExtension!!)
            uiThread {
                ivComicCover.setImageBitmap(bmp)
            }
        }

    }

}
