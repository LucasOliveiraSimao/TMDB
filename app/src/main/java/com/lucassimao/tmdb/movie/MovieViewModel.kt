package com.lucassimao.tmdb.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.lucassimao.tmdb.domain.usecase.GetMoviesUseCase
import com.lucassimao.tmdb.domain.usecase.UpdateMoviesUseCase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModel() {
    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUseCase.execute()
        emit(movieList)
    }
}