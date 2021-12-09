package com.lucassimao.tmdb.presentation.di

import com.lucassimao.tmdb.presentation.di.movie.MovieSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
}