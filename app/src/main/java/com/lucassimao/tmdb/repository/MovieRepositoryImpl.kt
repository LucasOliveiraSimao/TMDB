package com.lucassimao.tmdb.repository

import com.lucassimao.tmdb.MovieRepository
import com.lucassimao.tmdb.model.Movie
import com.lucassimao.tmdb.repository.datasource.MovieCacheDatasource
import com.lucassimao.tmdb.repository.datasource.MovieDBDatasource
import com.lucassimao.tmdb.repository.datasource.MovieRemoteDatasource

class MovieRepositoryImpl(
    private val movieRemoteDatasource: MovieRemoteDatasource,
    private val movieDBDatasource: MovieDBDatasource,
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

    private suspend fun getMoviesFromDB(): List<Movie> {
        lateinit var movieList: List<Movie>
        try {
            movieList = movieDBDatasource.getMoviesFromDB()
        } catch (e: Exception) {

        }
        if (movieList.isNotEmpty()) {
            return movieList
        } else {
            movieList = getMoviesFromAPI()
            movieDBDatasource.saveMoviesToDB(movieList)
        }
        return movieList
    }

    private suspend fun getMoviesFromCache(): List<Movie> {
        lateinit var movieList: List<Movie>
        try {
            movieList = movieCacheDatasource.getMoviesFromCache()
        } catch (e: Exception) {

        }
        if (movieList.isNotEmpty()) {
            return movieList
        } else {
            movieList = getMoviesFromDB()
            movieCacheDatasource.saveMoviesToCache(movieList)
        }
        return movieList
    }
}