package com.example.artspace.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.artspace.model.ArtWorkViewData
import com.example.artspace.R

class ArtWorkViewModel : ViewModel() {
    private val items = listOf(
        ArtWorkViewData(
            artWorkDataId = 1,
            artImage = R.drawable.art_work_1,
            title = "Michael Angelo's Painting",
            artist = "Adrianna Geo",
            year = "2019"
        ),
        ArtWorkViewData(
            artWorkDataId = 2,
            artImage = R.drawable.art_work_2,
            title = "Flower In a Metal Vase",
            artist = "Europeana",
            year = "2020"
        ),
        ArtWorkViewData(
            artWorkDataId = 3,
            artImage = R.drawable.art_work_3,
            title = "Beautiful Ocean Floor",
            artist = "Hendrik Donnestad",
            year = "2018"
        ),
        ArtWorkViewData(
            artWorkDataId = 4,
            artImage = R.drawable.art_work_4,
            title = "Part of City Space",
            artist = "Jene Stephaniuk",
            year = "2020"
        ),
        ArtWorkViewData(
            artWorkDataId = 5,
            artImage = R.drawable.art_work_5,
            title = "Great Old Castle Segovia",
            artist = "David Roberts",
            year = "2020"
        ),
    )

    private var currentIndex by mutableIntStateOf(0)

    val currentItem: ArtWorkViewData
        get() = items[currentIndex]

    fun next() {
        if (currentIndex == items.size - 1) {
            currentIndex = 1
        } else {
            currentIndex++
        }
    }

    fun previous() {
        if (currentIndex == 0) {
            currentIndex = items.size - 1
        } else {
            currentIndex--
        }
    }
}