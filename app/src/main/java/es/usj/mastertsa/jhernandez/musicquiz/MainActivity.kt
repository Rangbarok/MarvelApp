package es.usj.mastertsa.jhernandez.musicquiz

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.View.MeasureSpec.getSize
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Comic
import es.usj.mastertsa.jhernandez.musicquiz.singleton.InterfaceRefreshList
import es.usj.mastertsa.jhernandez.musicquiz.singleton.MarvelData
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync

import org.jetbrains.anko.doAsyncResult
import org.jetbrains.anko.uiThread
import java.beans.PropertyChangeListener
import java.io.Serializable

class MainActivity : AppCompatActivity() {

    companion object {
        var ctx: Context? = null
    }

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: ComicsAdapter? = null
    private var comicsInternal: ArrayList<Comic> = arrayListOf()

    override fun onPause() {
        //MarvelData.cleanMarvelServiceAPI()
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

        adapter = ComicsAdapter(comicsInternal, object: ClickListener {
            override fun onClick(view: View, position: Int) {
                val detailedComic = comicsInternal[position]
                val intent = Intent(this@MainActivity, ComicDetail::class.java).apply {
                    //TODO: buscar otra manera de hacer esto para poder enviar solo el Comic o ComicRoom y que ComicDetail se encarge de representarlo
                    putExtra("comic_id", detailedComic.id)
                    putExtra("comic_title", detailedComic.title)
                    putExtra("comic_description", detailedComic.description)
                    putExtra("comic_creators_num", detailedComic.creators?.items?.size)
                    putExtra("comic_characters_num", detailedComic.characters?.items?.size)
                    putExtra("comic_thumbnail_extension", detailedComic.thumbnail?.extension)
                    putExtra("comic_thumbnail_path", detailedComic.thumbnail?.path)
                }
                startActivity(intent)
            }
        })
        layoutManager = LinearLayoutManager(this)
        rvComicList?.addItemDecoration(DividerItemDecoration(this, OrientationHelper.VERTICAL))
        rvComicList?.layoutManager = layoutManager
        rvComicList?.adapter = adapter
        MarvelData.refreshListListeners.add(object: InterfaceRefreshList {
            override fun refreshListRequest() {
                Log.e("MARVEL_APP", "Comics data change to")
                runOnUiThread {
                    updateView()
                }
            }
        })
        // TODO: cuando se llegue al final de la listview pedir nuevos comics
        /*rvComicList.addOnScrollListener(object: RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                if (rvComicList.canScrollVertically(1)) {
                    Log.e("MARVEL_APP", "BOTTOM TOUCHED")
                    MarvelData.getNextComicsFromAPI()
                }
            }
            /*override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)

                if (rvComicList.canScrollVertically(1)) {
                    Log.e("MARVEL_APP", "BOTTOM TOUCHED")
                    MarvelData.getNextComicsFromAPI()
                }
            }*/
        })*/

        MarvelData.getComicsFromCache { comicsRoom ->
            Log.e("MARVEL_APP", "Comics in cache Room :: $comicsRoom")
            if (MarvelData.comicsAPI.size == 0) {
                Log.e("MARVEL_APP", "Getting new comics from singleton")
                MarvelData.getNextComicsFromAPI()
            }
        }

    }

    fun updateView() {
        Log.e("MARVEL_APP", "Updating view")
        comicsInternal.addAll(MarvelData.comicsAPI)
        adapter!!.updateData(comicsInternal)
        adapter!!.notifyDataSetChanged()
    }

}
