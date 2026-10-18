package com.example.bookshelfapp.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.bookshelfapp.BookApplication
import com.example.bookshelfapp.data.repository.GutendexRepository
import com.example.bookshelfapp.model.Book
import kotlinx.coroutines.launch

sealed interface BookUiState {
    data class Success(val data: List<Book>): BookUiState
    object Error: BookUiState
    object Loading: BookUiState
}


class BookViewModel(private val gutendexRepository: GutendexRepository) : ViewModel() {
    var bookUiState: BookUiState by mutableStateOf(BookUiState.Loading)
        private set

    init {
        getBooks()
    }

    fun getBooks() {
        viewModelScope.launch {
            bookUiState = BookUiState.Loading
            bookUiState = try {
                val result = gutendexRepository.getBooks()
                BookUiState.Success(result)
            } catch (e: Exception) {
                BookUiState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as BookApplication)
                val gutendexRepository = application.container.gutendexRepository
                BookViewModel(gutendexRepository)
            }
        }
    }
}