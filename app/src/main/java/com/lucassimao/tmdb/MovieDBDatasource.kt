package com.lucassimao.tmdb

import com.lucassimao.tmdb.model.Movie

interface MovieDBDatasource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}