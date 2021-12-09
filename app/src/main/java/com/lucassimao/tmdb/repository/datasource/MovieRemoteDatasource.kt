package com.lucassimao.tmdb.repository.datasource

import com.lucassimao.tmdb.model.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies(): Response<MovieList>
}