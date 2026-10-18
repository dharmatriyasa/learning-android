package com.example.bookshelfapp.ui.app

import android.annotation.SuppressLint
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bookshelfapp.R
import com.example.bookshelfapp.ui.view.HomeScreen
import com.example.bookshelfapp.ui.viewmodel.BookViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BookApp() {
    Scaffold(
        topBar = { BookTopAppBar() }
    ) {
        Surface {
            val bookViewModel: BookViewModel = viewModel(
                factory = BookViewModel.Factory
            )

            HomeScreen(
                bookUiState = bookViewModel.bookUiState,
                retryAction = bookViewModel::getBooks,
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookTopAppBar(
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name)
            )
        },
        modifier = modifier,
    )
}