package com.example.amphibians.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.amphibians.AmphibianApplication
import com.example.amphibians.data.AmphibianRepository
import com.example.amphibians.model.Amphibian
import kotlinx.coroutines.launch

sealed interface AmphibianUiState {
    data class Success(val data: List<Amphibian>): AmphibianUiState
    object Error: AmphibianUiState
    object Loading: AmphibianUiState
}

class AmphibianViewModel(private val amphibianRepository: AmphibianRepository) : ViewModel() {
    var amphibianUiState: AmphibianUiState by mutableStateOf(AmphibianUiState.Loading)
        private set

    init {
        getAmphibians()
    }

    fun getAmphibians() {
        viewModelScope.launch {
            amphibianUiState = AmphibianUiState.Loading
            amphibianUiState = try {
                val result = amphibianRepository.getAmphibians()
                AmphibianUiState.Success(result)
            } catch (e: Exception) {
                println("Dharma ganteng e: $e")
                AmphibianUiState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as AmphibianApplication)
                val amphibianRepository = application.container.amphibianRepository
                AmphibianViewModel(amphibianRepository)
            }
        }
    }
}
