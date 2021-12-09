package com.lucassimao.tmdb.data.repository.datasource

import com.lucassimao.tmdb.data.model.Movie

interface MovieCacheDatasource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}