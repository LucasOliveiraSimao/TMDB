package com.lucassimao.tmdb.di

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
}