package com.lucassimao.tmdb.domain.usecase

import com.lucassimao.tmdb.domain.MovieRepository
import com.lucassimao.tmdb.data.model.Movie

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie> = movieRepository.getMovies()
}