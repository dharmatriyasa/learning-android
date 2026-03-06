package com.example.gridlist.data

import android.annotation.SuppressLint
import com.example.gridlist.R
import com.example.gridlist.model.CardData

object DataSource {
    @SuppressLint("ResourceType")
    val topics = listOf<CardData>(
        CardData(R.string.architecture, 58, R.drawable.architecture),
        CardData(R.string.crafts, 121, R.drawable.crafts),
        CardData(R.string.business, 78, R.drawable.business),
        CardData(R.string.culinary, 118, R.drawable.culinary),
        CardData(R.string.design, 423, R.drawable.design),
        CardData(R.string.fashion, 92, R.drawable.fashion),
        CardData(R.string.film, 165, R.drawable.film),
        CardData(R.string.gaming, 164, R.drawable.gaming),
        CardData(R.string.drawing, 326, R.drawable.drawing),
        CardData(R.string.lifestyle, 305, R.drawable.lifestyle),
        CardData(R.string.music, 212, R.drawable.music),
        CardData(R.string.painting, 172, R.drawable.painting),
        CardData(R.string.photography, 321, R.drawable.photography),
        CardData(R.string.tech, 118, R.drawable.tech)
    )
}