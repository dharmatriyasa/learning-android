package com.example.bookshelfapp

import android.app.Application
import com.example.bookshelfapp.di.AppContainer
import com.example.bookshelfapp.di.DefaultAppContainer

class BookApplication: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
