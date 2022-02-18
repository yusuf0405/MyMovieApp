package com.example.mymovieapp.person_screen.domain.model


import com.google.gson.annotations.SerializedName

data class PersonResponse(
    @SerializedName("profile_path")
    val poster: String,
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val personList: List<Person>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int,
)