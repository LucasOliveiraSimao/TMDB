package com.lucassimao.tmdb.presentation.di.movie

import com.lucassimao.tmdb.presentation.HomeActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(homeActivity: HomeActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): MovieSubComponent
    }
}