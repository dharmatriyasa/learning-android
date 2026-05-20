package com.example.mycityapp.ui

import androidx.lifecycle.ViewModel
import com.example.mycityapp.data.CityHomeUiState
import com.example.mycityapp.data.ItemType
import com.example.mycityapp.data.ScreenType
import com.example.mycityapp.data.repository.CityRepository
import com.example.mycityapp.model.ListItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class CityHomeViewModel(
    private val cityRepository: CityRepository = CityRepository(),
) : ViewModel() {

    private val _uiState = MutableStateFlow(CityHomeUiState())
    val uisState: StateFlow<CityHomeUiState> = _uiState

    init {
        initializeUiState()
    }

    fun updateCurrentListState(
        itemType: ItemType,
        screenType: ScreenType,
    ) {
        val items = cityRepository.getListItems(type = itemType)
        _uiState.update {
            it.copy(
                itemType = itemType,
                itemList = items,
                screenType = screenType,
            )
        }
    }

    fun getDetailPlaceState(
        id: String,
        screenType: ScreenType,
    ) {
        val item = _uiState.value.itemList.find { it.itemId == id }
        _uiState.update {
            it.copy(
                selectedPlace = item,
                screenType = screenType,
            )
        }
    }

    private fun initializeUiState() {
        val items = cityRepository.getCategoryItems(type = ItemType.Categories)
        _uiState.value = CityHomeUiState(
            screenType = ScreenType.List,
            itemType = ItemType.Categories,
            categoryItemList = items,
        )
    }

    private fun setItemType(type: ItemType) {
        _uiState.update {
            it.copy(
                itemType = type,
            )
        }
    }

    private fun setScreenType(type: ScreenType) {
        _uiState.update {
            it.copy(
                screenType = type,
            )
        }
    }

    private fun setSelectedPlace(item: ListItem) {
        _uiState.update {
            it.copy(
                selectedPlace = item,
            )
        }
    }
}