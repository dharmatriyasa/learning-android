package com.example.bookshelfapp.model

import com.google.gson.annotations.SerializedName

data class Formats(
    @SerializedName("image/jpeg") val imageUrl: String?
)
