package com.example.bookshelfapp.model

import com.google.gson.annotations.SerializedName

data class GutendexResponse(
    @SerializedName("count") val count: Int,
    @SerializedName("next") val next: String?,
    @SerializedName("previous") val previous: String?,
    @SerializedName("results") val results: List<Book>
)
