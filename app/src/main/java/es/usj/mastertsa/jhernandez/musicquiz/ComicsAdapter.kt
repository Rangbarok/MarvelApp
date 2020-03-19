package es.usj.mastertsa.jhernandez.musicquiz

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import es.usj.mastertsa.jhernandez.musicquiz.client.model.Comic
import kotlinx.android.synthetic.main.template.view.*
import org.jetbrains.anko.doAsync
import java.net.URL


class ComicsAdapter(comics: ArrayList<Comic>, private var clickListener: ClickListener): RecyclerView.Adapter<ComicsAdapter.ViewHolder>() {

    private var comics: ArrayList<Comic>? = null
    private var viewHolder: ViewHolder? = null

    init {
        this.comics = comics
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.template, parent, false)
        viewHolder = ViewHolder(view, clickListener)

        return viewHolder!!
    }

    override fun getItemCount(): Int {
        return this.comics?.count()!!
    }

    override fun onBindViewHolder(holder: ComicsAdapter.ViewHolder, position: Int) {
        val comic = this.comics?.get(position)
        holder.name?.text = comic?.title
        if (!comic?.images?.isNullOrEmpty()!!) {
            doAsync {
                val url: URL = URL("${comic.thumbnail?.path}/portrait_medium.${comic.thumbnail?.extension}")
                val bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream())
                holder.photo?.setImageBitmap(bmp)
            }
        }
    }

    class ViewHolder(view: View, clickListener: ClickListener): RecyclerView.ViewHolder(view), View.OnClickListener {
        var photo: ImageView? = null
        var name: TextView? = null
        var clickListener: ClickListener? = null

        init {
            photo = view.ivPhoto
            name = view.tvCreators
            this.clickListener = clickListener
            view.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            this.clickListener?.onClick(v!!, adapterPosition)
        }
    }

}