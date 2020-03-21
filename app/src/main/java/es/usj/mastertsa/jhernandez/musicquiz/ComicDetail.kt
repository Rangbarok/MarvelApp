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

    private var comic: GeneralComic? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic_detail)

        comic = intent.extras?.get("comic") as GeneralComic
        tvComicTitle.text = comic?.title
        tvCreators.text = comic?.numberOfCreators.toString()
        tvCharacters.text = comic?.numberOfCharacter.toString()
        tvDescirption.text = comic?.description

        doAsync {
            val bmp = MarvelData.getAPICoverImage(comic?.thumbnailPath!!, comic?.thumbnailExtension!!)
            uiThread {
                ivComicCover.setImageBitmap(bmp)
            }
        }

    }

}
