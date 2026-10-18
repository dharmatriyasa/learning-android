package com.example.bookshelfapp.model

import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("id") val id: Int,
    @SerializedName("formats") val formats: Formats,
)
