package com.example.jsonapp.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jsonapp.model.Post
import com.example.jsonapp.ui.component.PostCard

@Composable
fun JsonHomeScreen(
    modifier: Modifier = Modifier,
) {
    val viewModel: JsonViewModel = viewModel()
    val state = viewModel.uiState.collectAsState().value

    when(state) {
        is JsonUiState.Loading -> {
            CircularProgressIndicator(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.Center)
            )
        }

        is JsonUiState.Success<List<Post>> -> {
            LazyColumn(
                modifier = modifier,
            ) {
                items(state.data) { post ->
                    PostCard(
                        post = post,
                    )
                }
            }
        }

        is JsonUiState.Error -> {
            Text("Error: ${state.message}")
        }
    }
}