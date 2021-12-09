package com.lucassimao.tmdb.repository.datasource

import com.lucassimao.tmdb.model.Movie

interface MovieCacheDatasource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)
}