package com.lucassimao.tmdb.di

import com.lucassimao.tmdb.di.movie.MovieSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
}