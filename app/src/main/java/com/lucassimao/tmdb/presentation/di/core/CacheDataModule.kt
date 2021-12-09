package com.lucassimao.tmdb.presentation.di.core

import com.lucassimao.tmdb.data.repository.datasource.MovieCacheDatasource
import com.lucassimao.tmdb.data.repository.datasourceImpl.MovieCacheDatasourceImpl
import dagger.Provides
import javax.inject.Singleton

class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDatasource(): MovieCacheDatasource {
        return MovieCacheDatasourceImpl()
    }
}