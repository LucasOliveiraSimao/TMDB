package com.lucassimao.tmdb.di

import com.lucassimao.tmdb.domain.usecase.GetMoviesUseCase
import com.lucassimao.tmdb.domain.usecase.UpdateMoviesUseCase
import com.lucassimao.tmdb.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUseCase
        )
    }
}