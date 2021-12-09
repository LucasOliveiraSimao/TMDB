package com.lucassimao.tmdb.data.repository.datasourceImpl

import com.lucassimao.tmdb.data.api.TMDBService
import com.lucassimao.tmdb.data.model.MovieList
import com.lucassimao.tmdb.data.repository.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDatasourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}