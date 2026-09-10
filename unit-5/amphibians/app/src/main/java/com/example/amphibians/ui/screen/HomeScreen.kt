package com.example.amphibians.ui.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.amphibians.ui.component.AmphibianListScreen
import com.example.amphibians.ui.component.ErrorView
import com.example.amphibians.ui.component.LoadingView
import com.example.amphibians.ui.viewmodel.AmphibianUiState

@Composable
fun HomeScreen(
    amphibianUiState: AmphibianUiState,
    retryAction: () -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    when (amphibianUiState) {
        is AmphibianUiState.Loading -> LoadingView(modifier = modifier.fillMaxSize())
        is AmphibianUiState.Success -> AmphibianListScreen(
            amphibianUiState.data,
            modifier = modifier.fillMaxWidth(),
            contentPadding = contentPadding,
        )
        is AmphibianUiState.Error -> ErrorView(retryAction, modifier = modifier.fillMaxSize())
    }
}