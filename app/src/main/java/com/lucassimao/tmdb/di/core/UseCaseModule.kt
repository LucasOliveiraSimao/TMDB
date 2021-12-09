package com.lucassimao.tmdb.di.core

import com.lucassimao.tmdb.domain.MovieRepository
import com.lucassimao.tmdb.domain.usecase.GetMoviesUseCase
import com.lucassimao.tmdb.domain.usecase.UpdateMoviesUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {
    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase {
        return UpdateMoviesUseCase(movieRepository)
    }
}