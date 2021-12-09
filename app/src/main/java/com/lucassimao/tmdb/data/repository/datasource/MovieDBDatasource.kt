package com.lucassimao.tmdb.data.repository.datasource

import com.lucassimao.tmdb.data.model.Movie

interface MovieDBDatasource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}