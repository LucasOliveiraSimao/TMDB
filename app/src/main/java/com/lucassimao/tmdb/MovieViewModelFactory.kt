package com.lucassimao.tmdb

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lucassimao.tmdb.domain.usecase.GetMoviesUseCase
import com.lucassimao.tmdb.domain.usecase.UpdateMoviesUseCase

class MovieViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return MovieViewModel(getMoviesUseCase, updateMoviesUseCase) as T
    }
}