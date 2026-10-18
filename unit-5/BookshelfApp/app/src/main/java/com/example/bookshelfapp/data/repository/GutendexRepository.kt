package com.example.bookshelfapp.data.repository

import com.example.bookshelfapp.data.network.GutendexApiService
import com.example.bookshelfapp.model.Book

interface GutendexRepository {
    suspend fun getBooks(
        search: String? = null
    ): List<Book>
}

class GutendexRepositoryImpl(
    private val gutendexApiService: GutendexApiService
) : GutendexRepository {
    override suspend fun getBooks(search: String?): List<Book> = gutendexApiService.getBooks(search).results
}
