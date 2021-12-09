package com.lucassimao.tmdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lucassimao.tmdb.model.Movie

@Database(
    entities = [Movie::class],
    version = 1,
    exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDAO
}