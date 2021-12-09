package com.lucassimao.tmdb.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lucassimao.tmdb.data.model.Movie

@Database(
    entities = [Movie::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDAO
}