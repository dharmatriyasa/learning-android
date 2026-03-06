package com.example.gridlist.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CardData(
    @StringRes val title: Int,
    val count: Int,
    @DrawableRes val leftImage: Int,
)
