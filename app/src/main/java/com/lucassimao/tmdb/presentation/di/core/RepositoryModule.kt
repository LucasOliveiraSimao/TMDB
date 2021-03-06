package com.lucassimao.tmdb.presentation.di.core

import com.lucassimao.tmdb.data.repository.MovieRepositoryImpl
import com.lucassimao.tmdb.data.repository.datasource.MovieCacheDatasource
import com.lucassimao.tmdb.data.repository.datasource.MovieDBDatasource
import com.lucassimao.tmdb.data.repository.datasource.MovieRemoteDatasource
import com.lucassimao.tmdb.domain.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieDBDatasource: MovieDBDatasource,
        movieCacheDatasource: MovieCacheDatasource
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieDBDatasource,
            movieCacheDatasource
        )
    }
}