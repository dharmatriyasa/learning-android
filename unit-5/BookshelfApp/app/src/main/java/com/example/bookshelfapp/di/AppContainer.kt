package com.example.bookshelfapp.di

import com.example.bookshelfapp.data.network.GutendexApiService
import com.example.bookshelfapp.data.repository.GutendexRepository
import com.example.bookshelfapp.data.repository.GutendexRepositoryImpl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer {
    val gutendexRepository: GutendexRepository
}

class DefaultAppContainer: AppContainer {
    private val baseUrl = "https://gutendex.com/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(baseUrl)
        .build()

    private val retrofitService: GutendexApiService by lazy {
        retrofit.create(GutendexApiService::class.java)
    }

    override val gutendexRepository: GutendexRepository by lazy {
        GutendexRepositoryImpl(retrofitService)
    }
}
