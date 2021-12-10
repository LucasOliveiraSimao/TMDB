package com.lucassimao.tmdb

import android.app.Application
import com.lucassimao.tmdb.presentation.di.Injector
import com.lucassimao.tmdb.presentation.di.core.*
import com.lucassimao.tmdb.presentation.di.movie.MovieSubComponent

class App : Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

}