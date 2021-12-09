package com.lucassimao.tmdb

import com.lucassimao.tmdb.data.model.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>
    suspend fun updateMovies(): List<Movie>
}