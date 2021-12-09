package com.lucassimao.tmdb.di.core

import com.lucassimao.tmdb.data.db.MovieDAO
import com.lucassimao.tmdb.data.repository.datasource.MovieDBDatasource
import com.lucassimao.tmdb.data.repository.datasourceImpl.MovieDBDatasourceImpl
import dagger.Provides
import javax.inject.Singleton

class DBDataModule {
    @Singleton
    @Provides
    fun provideMovieDataSource(movieDAO: MovieDAO): MovieDBDatasource {
        return MovieDBDatasourceImpl(movieDAO)
    }
}