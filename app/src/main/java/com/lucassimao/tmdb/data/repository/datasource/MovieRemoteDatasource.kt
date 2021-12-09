package com.lucassimao.tmdb.data.repository.datasource

import com.lucassimao.tmdb.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies(): Response<MovieList>
}