package es.usj.mastertsa.jhernandez.musicquiz

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import es.usj.mastertsa.jhernandez.musicquiz.client.ApiClient
import es.usj.mastertsa.jhernandez.musicquiz.client.api.DefaultApi
import es.usj.mastertsa.jhernandez.musicquiz.client.auth.MarvelAuth
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Comic
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync

import org.jetbrains.anko.doAsyncResult
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {
    private val publicToken = "867ef9fe67a6ded32323fa5824f03945"
    private var temporalTimeStamp = "1581706782"
    private val temporalHash = "e49d2084fd36c2d43967ef056eee2ab8"

    private var list: RecyclerView? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: ComicsAdapter? = null

    var marvelRequestInterceptor = MarvelAuth(temporalTimeStamp, publicToken, temporalHash)

    private val apiClient get () = ApiClient().apply {
        addAuthorization("MarvelLibApp", marvelRequestInterceptor)
    }

    private var marvelServiceApi = apiClient.buildClient(DefaultApi::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)
        rvComicList?.addItemDecoration(DividerItemDecoration(this, OrientationHelper.VERTICAL))

        doAsyncResult {
            var comics: ArrayList<Comic>? = null

            marvelRequestInterceptor.limit = 20
            val response = marvelServiceApi.getComicsCollection(mapOf())

            if (response.code == 200){
                comics = ArrayList(response.data?.results)
            }

            uiThread {
                adapter = ComicsAdapter(comics!!, object: ClickListener {
                    override fun onClick(view: View, position: Int) {
                        Log.e("MARVEL APP", "COMICS TAPPED IN POS $position")
                        val detailedComic = marvelServiceApi.getComicIndividual(comics[position].id)
                    }
                })
                rvComicList?.layoutManager = layoutManager
                rvComicList?.adapter = adapter
            }
        }

    }

}
