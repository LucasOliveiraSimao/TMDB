package com.lucassimao.tmdb

import com.lucassimao.tmdb.model.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies(): Response<MovieList>
}