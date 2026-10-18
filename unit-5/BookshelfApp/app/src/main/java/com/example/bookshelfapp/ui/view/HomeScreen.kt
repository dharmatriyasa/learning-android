package com.example.bookshelfapp.ui.view

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bookshelfapp.ui.view.components.BookView
import com.example.bookshelfapp.ui.view.components.ErrorView
import com.example.bookshelfapp.ui.view.components.LoadingView
import com.example.bookshelfapp.ui.viewmodel.BookUiState

@Composable
fun HomeScreen(
    bookUiState: BookUiState,
    retryAction: () -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    when (bookUiState) {
        is BookUiState.Loading -> LoadingView(modifier)
        is BookUiState.Error -> ErrorView(retryAction, modifier)
        is BookUiState.Success -> BookView(bookUiState.data, modifier)
    }
}