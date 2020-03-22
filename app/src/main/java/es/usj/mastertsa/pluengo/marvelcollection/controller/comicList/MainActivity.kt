package es.usj.mastertsa.pluengo.marvelcollection.controller.comicList

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import es.usj.mastertsa.pluengo.marvelcollection.R
import es.usj.mastertsa.pluengo.marvelcollection.controller.comicDetail.ComicDetail
import es.usj.mastertsa.pluengo.marvelcollection.model.GeneralComic
import es.usj.mastertsa.pluengo.marvelcollection.singleton.InterfaceRefreshList
import es.usj.mastertsa.pluengo.marvelcollection.singleton.MarvelData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        var ctx: Context? = null
    }

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: ComicsAdapter? = null
    private var loading: Boolean = false
    private var comicsInternal: ArrayList<GeneralComic> = arrayListOf()

    override fun onResume() {
        super.onResume()
        MarvelData.buildMarvelServiceAPI()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ctx = this
        MarvelData.buildMarvelServiceAPI()
        comicsInternal.addAll(convertRoomComicToGeneral())

        adapter =
            ComicsAdapter(comicsInternal, object : ClickListener {
                override fun onClick(view: View, position: Int) {
                    val detailedComic = comicsInternal[position]
                    val intent = Intent(this@MainActivity, ComicDetail::class.java
                    ).apply {
                        putExtra("comic", detailedComic)
                    }
                    startActivity(intent)
                }
            })
        layoutManager = LinearLayoutManager(this)
        rvComicList?.addItemDecoration(DividerItemDecoration(this, OrientationHelper.VERTICAL))
        rvComicList?.layoutManager = layoutManager
        rvComicList?.adapter = adapter
        MarvelData.refreshListListeners.add(object:
            InterfaceRefreshList {
            override fun refreshListRequest() {
                runOnUiThread {
                    updateView()
                }
            }
        })

        rvComicList.addOnScrollListener(object: RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                if (!loading && !rvComicList!!.canScrollVertically(1)) {
                    loading = true
                    Toast.makeText(applicationContext, "Getting new content", Toast.LENGTH_SHORT).show()
                    MarvelData.getNextComicsFromAPI()
                    loading = false
                }
            }
        })

        comicsInternal.addAll(convertRoomComicToGeneral())
        if (comicsInternal.size < 20) {
            MarvelData.getNextComicsFromAPI()
        }
    }

    private fun updateView() {
        val comicsToAdd = convertComicAPIToGeneral()
        comicsToAdd.removeAll(comicsInternal)
        comicsInternal.addAll(comicsToAdd)
        adapter!!.updateData(comicsToAdd)
        adapter!!.notifyDataSetChanged()

        Toast.makeText(applicationContext, "New content received", Toast.LENGTH_SHORT).show()
    }

    private fun convertRoomComicToGeneral(): ArrayList<GeneralComic> {
        val generalComics = arrayListOf<GeneralComic>()
        MarvelData.comicsRoom?.forEach { generalComics.add(GeneralComic(it)) }
        return generalComics
    }

    private fun convertComicAPIToGeneral(): ArrayList<GeneralComic> {
        val generalComics = arrayListOf<GeneralComic>()
        MarvelData.comicsAPI.forEach {
            generalComics.add(GeneralComic(it))
        }
        return generalComics
    }

}
