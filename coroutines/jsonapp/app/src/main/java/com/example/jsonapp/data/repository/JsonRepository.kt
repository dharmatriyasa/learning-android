package com.example.jsonapp.data.repository

import com.example.jsonapp.data.JsonDataProvider
import com.example.jsonapp.model.Post
import kotlinx.coroutines.delay
import org.json.JSONArray

class JsonRepository {
    suspend fun getPost(): List<Post> {
        delay(1000)
        return parseJson(JsonDataProvider.posts)
    }

    private fun parseJson(json: String): List<Post> {
        val result = mutableListOf<Post>()

        val jsonArray = JSONArray(json)

        for (i in 0 until jsonArray.length()) {
            val obj = jsonArray.getJSONObject(i) ?: continue

            val post = Post(
                userId = obj.getInt("userId"),
                id = obj.getInt("id"),
                title = obj.getString("title"),
                body = obj.getString("body"),
            )

            result.add(post)
        }

        return result
    }
}