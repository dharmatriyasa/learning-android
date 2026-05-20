package com.example.mycityapp.ui.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mycityapp.data.ScreenName
import com.example.mycityapp.data.ScreenType
import com.example.mycityapp.ui.CityHomeViewModel
import com.example.mycityapp.ui.component.CityAppBar

@Composable
fun CityHomeApp(
    viewModel: CityHomeViewModel = viewModel(),
    navController: NavHostController = rememberNavController(),
) {
    val backStackEntry by navController.currentBackStackEntryAsState()

    val uiState by viewModel.uisState.collectAsState()

    val currentScreen = ScreenName.valueOf(
        value = backStackEntry?.destination?.route ?: ScreenName.MyCity.name
    )

    Scaffold(
        topBar = {
            CityAppBar(
                currentScreen = currentScreen,
                canPopScreen = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) {  innerPadding ->

        NavHost(
            navController = navController,
            startDestination = ScreenName.MyCity.name,
            modifier = Modifier.padding(innerPadding),
        ) {
            composable(route = ScreenName.MyCity.name) {
                CityHomeScreen(
                    listItems = uiState.categoryItemList,
                    onListTapped = { itemType ->
                        viewModel.updateCurrentListState(
                            itemType = itemType,
                            screenType = ScreenType.List,
                        )
                        navController.navigate(ScreenName.Category.name)
                    }
                )
            }

            composable(route = ScreenName.Category.name) {
                CategoryScreen(
                    listItems = uiState.itemList,
                    onListTapped = { itemId ->
                        viewModel.getDetailPlaceState(id = itemId, screenType = ScreenType.Detail)
                        navController.navigate(ScreenName.Place.name)
                    }
                )
            }

            composable(route = ScreenName.Place.name) {
                PlaceScreen(
                    item = uiState.selectedPlace,
                )
            }
        }
    }
}
