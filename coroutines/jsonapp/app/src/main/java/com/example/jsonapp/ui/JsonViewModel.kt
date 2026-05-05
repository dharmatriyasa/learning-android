package com.example.jsonapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jsonapp.data.repository.JsonRepository
import com.example.jsonapp.model.Post
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class JsonViewModel(
    private val repository: JsonRepository = JsonRepository(),
) : ViewModel() {

    private val _uiState = MutableStateFlow<JsonUiState<List<Post>>>(JsonUiState.Loading)
    val uiState: StateFlow<JsonUiState<List<Post>>> = _uiState

    init {
        loadPosts()
    }

    fun loadPosts() {
        viewModelScope.launch {
            _uiState.value = JsonUiState.Loading

            try {
                val posts = withContext(Dispatchers.IO) {
                    repository.getPost()
                }
                _uiState.value = JsonUiState.Success(posts)
            } catch (e: Exception) {
                _uiState.value = JsonUiState.Error(e.message ?: "Error")
            }
        }
    }
}