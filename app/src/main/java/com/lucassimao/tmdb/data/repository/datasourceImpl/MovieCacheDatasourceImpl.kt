package com.lucassimao.tmdb.data.repository.datasourceImpl

import com.lucassimao.tmdb.data.model.Movie
import com.lucassimao.tmdb.data.repository.datasource.MovieCacheDatasource

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