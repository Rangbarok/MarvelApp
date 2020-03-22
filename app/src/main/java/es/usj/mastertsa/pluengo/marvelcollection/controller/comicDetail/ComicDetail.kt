package es.usj.mastertsa.pluengo.marvelcollection.controller.comicDetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.usj.mastertsa.pluengo.marvelcollection.R
import es.usj.mastertsa.pluengo.marvelcollection.model.GeneralComic
import es.usj.mastertsa.pluengo.marvelcollection.singleton.MarvelData
import kotlinx.android.synthetic.main.activity_comic_detail.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

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
