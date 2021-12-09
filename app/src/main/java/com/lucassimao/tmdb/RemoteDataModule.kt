package com.lucassimao.tmdb

import com.lucassimao.tmdb.data.api.TMDBService
import com.lucassimao.tmdb.data.repository.datasource.MovieRemoteDatasource
import com.lucassimao.tmdb.data.repository.datasourceImpl.MovieRemoteDatasourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDatasourceImpl(
            tmdbService, apiKey
        )
    }
}