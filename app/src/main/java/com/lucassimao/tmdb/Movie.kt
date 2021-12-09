package com.lucassimao.tmdb

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id")
    val id: Int,
    @SerializedName("overview")
    val overview: String?,
    @SerializedName("poster_path")
    val poster_path: String?,
    @SerializedName("release_date")
    val release_date: String?,
    @SerializedName("title")
    val title: String?
)