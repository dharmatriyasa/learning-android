package com.example.jsonapp.ui

sealed interface JsonUiState<out T> {
    object Loading: JsonUiState<Nothing>
    data class Success<T>(val data: T): JsonUiState<T>
    data class Error(val message: String): JsonUiState<Nothing>
}
