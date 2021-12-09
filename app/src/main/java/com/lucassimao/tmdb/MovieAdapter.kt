package com.lucassimao.tmdb

import androidx.recyclerview.widget.RecyclerView
import com.lucassimao.tmdb.data.model.Movie

class MovieAdapter {
}

class MovieViewHolder(val binding: ListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(movie: Movie) {
        binding.titleItemList.text = movie.title
        binding.descriptionItemList.text = movie.overview

        val posterURL = "https://image.tmdb.org/t/p/w500" + movie.poster_path

        Glide.with(binding.imageItemList.context)
            .load(posterURL)
            .into(binding.imageItemList)
    }
}