package com.lucassimao.tmdb

import com.lucassimao.tmdb.model.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>
    suspend fun updateMovies(): List<Movie>
}