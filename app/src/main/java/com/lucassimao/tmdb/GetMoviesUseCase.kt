package com.lucassimao.tmdb

import com.lucassimao.tmdb.data.model.Movie

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie> = movieRepository.getMovies()
}