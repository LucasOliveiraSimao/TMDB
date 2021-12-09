package com.lucassimao.tmdb.domain.usecase

import com.lucassimao.tmdb.domain.MovieRepository
import com.lucassimao.tmdb.data.model.Movie

class UpdateMoviesUseCase(private val updateRepository: MovieRepository) {
    suspend fun execute(): List<Movie> = updateRepository.updateMovies()
}