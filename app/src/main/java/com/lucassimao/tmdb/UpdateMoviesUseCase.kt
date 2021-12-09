package com.lucassimao.tmdb

import com.lucassimao.tmdb.data.model.Movie

class UpdateMoviesUseCase(private val updateRepository: MovieRepository) {
    suspend fun execute(): List<Movie> = updateRepository.updateMovies()
}