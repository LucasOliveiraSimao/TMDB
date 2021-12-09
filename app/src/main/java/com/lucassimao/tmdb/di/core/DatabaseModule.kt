package com.lucassimao.tmdb.di.core

import android.content.Context
import androidx.room.Room
import com.lucassimao.tmdb.data.db.MovieDAO
import com.lucassimao.tmdb.data.db.TMDBDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(context: Context): TMDBDatabase {
        return Room.databaseBuilder(context, TMDBDatabase::class.java, "tmdb_database")
            .build()
    }

    @Singleton
    @Provides
    fun provideMovieDAO(tmdbDatabase: TMDBDatabase): MovieDAO {
        return tmdbDatabase.movieDao()
    }
}