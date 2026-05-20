package com.example.mycityapp.data.repository

import com.example.mycityapp.data.CityDataProvider
import com.example.mycityapp.data.ItemType
import com.example.mycityapp.model.ListCategoryItem
import com.example.mycityapp.model.ListItem
import org.json.JSONArray

class CityRepository {
    fun getCategoryItems(type: ItemType): List<ListCategoryItem> {
        val data = when(type) {
            ItemType.Categories -> CityDataProvider.categories
            ItemType.Culinary -> CityDataProvider.culinary
            ItemType.Cafe -> CityDataProvider.cafe
            ItemType.Attraction -> CityDataProvider.attraction
            ItemType.Marketplace -> CityDataProvider.marketplace
            ItemType.Park -> CityDataProvider.park
            ItemType.Entertainment -> CityDataProvider.entertainment
            ItemType.Accommodation -> CityDataProvider.accommodation
        }

        return parseJsonToListOfCategoryItem(data)
    }

    fun getListItems(type: ItemType): List<ListItem> {
        val data = when(type) {
            ItemType.Categories -> CityDataProvider.categories
            ItemType.Culinary -> CityDataProvider.culinary
            ItemType.Cafe -> CityDataProvider.cafe
            ItemType.Attraction -> CityDataProvider.attraction
            ItemType.Marketplace -> CityDataProvider.marketplace
            ItemType.Park -> CityDataProvider.park
            ItemType.Entertainment -> CityDataProvider.entertainment
            ItemType.Accommodation -> CityDataProvider.accommodation
        }

        return parseJsonToListOfListItem(data)
    }

    private fun parseJsonToListOfListItem(json: String): List<ListItem> {
        val result = mutableListOf<ListItem>()

        val jsonArray = JSONArray(json)

        for (i in 0 until jsonArray.length()) {
            val obj = jsonArray.getJSONObject(i) ?: continue
            val itemId = obj.getString("itemId")
            val imageUrl = obj.getString("imageUrl")
            val title = obj.getString("title")
            val description = obj.getString("description")

            val item = ListItem(
                itemId = itemId,
                imageUrl = imageUrl,
                title = title,
                description = description,
            )

            result.add(item)
        }

        return result
    }


    private fun parseJsonToListOfCategoryItem(json: String): List<ListCategoryItem> {
        val result = mutableListOf<ListCategoryItem>()

        val jsonArray = JSONArray(json)

        for (i in 0 until jsonArray.length()) {
            val obj = jsonArray.getJSONObject(i) ?: continue
            val itemId = obj.getString("itemId")
            val imageUrl = obj.getString("imageUrl")
            val title = obj.getString("title")
            val itemType = enumValues<ItemType>().find { it.name == title } ?: ItemType.Categories

            val item = ListCategoryItem(
                itemId = itemId,
                imageUrl = imageUrl,
                title = title,
                itemType = itemType,
            )

            result.add(item)
        }

        return result
    }
}