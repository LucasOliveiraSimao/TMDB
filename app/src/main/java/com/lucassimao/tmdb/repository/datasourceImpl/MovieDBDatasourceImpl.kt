package com.lucassimao.tmdb.repository.datasourceImpl

import com.lucassimao.tmdb.db.MovieDAO
import com.lucassimao.tmdb.model.Movie
import com.lucassimao.tmdb.repository.datasource.MovieDBDatasource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieDBDatasourceImpl(private val movieDAO: MovieDAO) : MovieDBDatasource {
    override suspend fun getMoviesFromDB(): List<Movie> {
        return movieDAO.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDAO.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDAO.deleteAllMovies()
        }
    }
}