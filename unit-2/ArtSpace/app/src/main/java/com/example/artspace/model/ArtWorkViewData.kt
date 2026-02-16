package com.example.artspace.model

import androidx.annotation.DrawableRes

data class ArtWorkViewData(
    val artWorkDataId: Int,
    @DrawableRes val artImage: Int,
    val title: String,
    val artist: String,
    val year: String,
)
