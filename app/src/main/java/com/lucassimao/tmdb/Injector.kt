package com.lucassimao.tmdb

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
}