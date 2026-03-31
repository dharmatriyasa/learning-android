package com.example.thirtyapps.model

import androidx.annotation.DrawableRes

data class Tip(
    val title: String,
    val description: String,
    @DrawableRes val imagePath: Int,
)
