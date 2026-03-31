package com.example.thirtyapps.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtyapps.component.TipCard
import com.example.thirtyapps.data.DataRepository

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    val tips = DataRepository.tips

    LazyColumn(
        modifier,
    ) {
        items(tips) { tip ->
            TipCard(
                modifier = Modifier.padding(
                    vertical = 12.dp,
                    horizontal = 16.dp,
                ),
                tip = tip,
            )
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}