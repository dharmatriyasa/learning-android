package com.example.gridlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gridlist.data.DataSource
import com.example.gridlist.ui.theme.GridListTheme
import com.example.gridlist.view.TopicCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GridListTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TopicGridList(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TopicGridList(modifier: Modifier = Modifier) {
    val topics = DataSource.topics
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(count = 2),
    ) {
        items(topics) { topic ->
            TopicCard(
                modifier = Modifier.padding(all = 8.dp),
                card = topic,
            )
        }
    }
}

@Preview
@Composable
private fun TopicGridListPreview() {
    GridListTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            TopicGridList(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}