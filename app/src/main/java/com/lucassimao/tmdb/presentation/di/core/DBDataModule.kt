package com.lucassimao.tmdb.presentation.di.core

import com.lucassimao.tmdb.data.db.MovieDAO
import com.lucassimao.tmdb.data.repository.datasource.MovieDBDatasource
import com.lucassimao.tmdb.data.repository.datasourceImpl.MovieDBDatasourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DBDataModule {
    @Singleton
    @Provides
    fun provideMovieDataSource(movieDAO: MovieDAO): MovieDBDatasource {
        return MovieDBDatasourceImpl(movieDAO)
    }
}