package com.example.mycityapp.model

import com.example.mycityapp.data.ItemType

data class ListCategoryItem(
    val itemId: String,
    val imageUrl: String,
    val title: String,
    val itemType: ItemType,
)
