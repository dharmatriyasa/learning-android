package com.example.mycityapp.data

import com.example.mycityapp.model.ListCategoryItem
import com.example.mycityapp.model.ListItem

data class CityHomeUiState(

    val screenType: ScreenType = ScreenType.List,

    val itemType: ItemType = ItemType.Categories,

    val categoryItemList: List<ListCategoryItem> = emptyList(),

    val categoryItemList2: List<ListCategoryItem> = emptyList(),

    val itemList: List<ListItem> = emptyList(),

    val selectedPlace: ListItem? = null,
)
