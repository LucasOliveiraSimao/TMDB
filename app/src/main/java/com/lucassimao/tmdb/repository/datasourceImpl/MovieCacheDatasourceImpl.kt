package com.lucassimao.tmdb.repository.datasourceImpl

import com.lucassimao.tmdb.model.Movie
import com.lucassimao.tmdb.repository.datasource.MovieCacheDatasource

class MovieCacheDatasourceImpl : MovieCacheDatasource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}