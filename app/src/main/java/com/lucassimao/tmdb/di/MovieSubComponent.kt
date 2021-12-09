package com.lucassimao.tmdb.di

import com.lucassimao.tmdb.HomeActivity
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