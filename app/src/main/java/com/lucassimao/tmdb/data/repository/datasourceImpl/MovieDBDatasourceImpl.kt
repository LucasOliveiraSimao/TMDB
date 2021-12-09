package com.lucassimao.tmdb.data.repository.datasourceImpl

import com.lucassimao.tmdb.data.db.MovieDAO
import com.lucassimao.tmdb.data.model.Movie
import com.lucassimao.tmdb.data.repository.datasource.MovieDBDatasource
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