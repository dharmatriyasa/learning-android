package com.example.bookshelfapp.data.network

import com.example.bookshelfapp.model.GutendexResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GutendexApiService {
    @GET("books")
    suspend fun getBooks(
        @Query("search") search: String? = null
    ): GutendexResponse
}
