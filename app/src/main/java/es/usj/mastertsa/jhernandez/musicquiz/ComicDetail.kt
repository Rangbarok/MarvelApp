package es.usj.mastertsa.jhernandez.musicquiz

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Comic
import kotlinx.android.synthetic.main.activity_comic_detail.*
import org.jetbrains.anko.doAsync
import java.net.URL

class ComicDetail : AppCompatActivity() {

    private var comic: Comic? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comic_detail)

        comic = intent.extras?.get("MARVEL_COMIC") as Comic

        doAsync {
            val url: URL = URL("${comic?.thumbnail?.path}/portrait_fantastic.${comic?.thumbnail?.extension}")
            val bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream())
            ivComicCover.setImageBitmap(bmp)
        }

        Log.e("MARVEL APP", comic?.creators?.items?.first()?.resourceURI)

        tvComicTitle.text = comic?.title
        tvCreators.text = "${comic?.creators?.items?.size}"
        tvCharacters.text = comic?.characters?.items?.size.toString()
        tvDescirption.text = comic?.description
    }

}
