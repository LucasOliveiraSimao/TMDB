package com.lucassimao.tmdb.repository

import com.lucassimao.tmdb.api.TMDBService
import com.lucassimao.tmdb.model.MovieList
import retrofit2.Response

class MovieRemoteDatasourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}