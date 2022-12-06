package com.example.movielist

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerMovie(
    private val context: Context, val movie: List<Poster>, val listener: OnMovieSelected
) : RecyclerView.Adapter<RecyclerMovie.MyHolder>() {

    interface OnMovieSelected{
        fun onImageSelected(movie:Poster)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyHolder(itemView)
    }

    // Передаємо дані до View
    override fun onBindViewHolder(holder: MyHolder, position: Int) {

        val mov = movie[position]

        Glide.with(context).load(mov.image).into(holder.image)
        holder.title.setText(mov.title)
        holder.genre.setText(mov.genre)

        holder.image.setOnClickListener{
            listener.onImageSelected(mov)
        }

    }

    override fun getItemCount(): Int {
        return movie.size
    }

    //    Екземпляр класу
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var title: TextView
        var genre: TextView

        init {
            image = itemView.findViewById(R.id.imageItem)
            title = itemView.findViewById(R.id.titleItem)
            genre = itemView.findViewById(R.id.genreItem)
        }
    }

}