package es.usj.mastertsa.jhernandez.musicquiz

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import es.usj.mastertsa.jhernandez.musicquiz.singleton.MarvelData
import kotlinx.android.synthetic.main.activity_main.*

import org.jetbrains.anko.doAsyncResult
import org.jetbrains.anko.uiThread
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    companion object {
        var ctx: Context? = null
    }

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: ComicsAdapter? = null

    override fun onPause() {
        MarvelData.cleanMarvelServiceAPI()
        super.onPause()
    }

    override fun onResume() {
        // TODO: recover all comics -> first in cache (Room), then API
        MarvelData.buildMarvelServiceAPI()
        super.onResume()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ctx = this
        MarvelData.buildMarvelServiceAPI()
        layoutManager = LinearLayoutManager(this)
        rvComicList?.addItemDecoration(DividerItemDecoration(this, OrientationHelper.VERTICAL))

        doAsyncResult {

            val comics = MarvelData.comics

            uiThread {
                adapter = ComicsAdapter(comics!!, object: ClickListener {
                    override fun onClick(view: View, position: Int) {
                        val detailedComic = comics[position]
                        val intent = Intent(this@MainActivity, ComicDetail::class.java)
                        intent.putExtra("MARVEL_COMIC", detailedComic as Serializable)
                        startActivity(intent)
                    }
                })
                rvComicList?.layoutManager = layoutManager
                rvComicList?.adapter = adapter
            }
        }

    }

}
