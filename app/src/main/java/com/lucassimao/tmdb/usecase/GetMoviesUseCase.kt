package com.lucassimao.tmdb.usecase

import com.lucassimao.tmdb.MovieRepository
import com.lucassimao.tmdb.data.model.Movie

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie> = movieRepository.getMovies()
}