package com.lucassimao.tmdb.repository

import com.lucassimao.tmdb.MovieRepository
import com.lucassimao.tmdb.model.Movie
import com.lucassimao.tmdb.repository.datasource.MovieCacheDatasource
import com.lucassimao.tmdb.repository.datasource.MovieDBDatasource
import com.lucassimao.tmdb.repository.datasource.MovieRemoteDatasource

class MovieRepositoryImpl(
    private val movieRemoteDatasource: MovieRemoteDatasource,
    private val movieLocalDatasource: MovieDBDatasource,
    private val movieCacheDatasource: MovieCacheDatasource
) : MovieRepository{
    override suspend fun getMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    override suspend fun updateMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    private suspend fun getMoviesFromAPI(): List<Movie> {
        lateinit var movieList: List<Movie>
        try {
            val response = movieRemoteDatasource.getMovies()
            val body = response.body()
            if (body != null) {
                movieList = body.movies!!
            }
        } catch (e: Exception) {

        }
        return movieList
    }
}