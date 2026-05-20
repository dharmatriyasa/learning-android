package com.example.mycityapp.ui.component

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mycityapp.model.ListItem

@Composable
fun CategoryListView(
    modifier: Modifier = Modifier,
    listItems: List<ListItem> = arrayListOf(),
) {
//    LazyColumn {
//        items(listItems) { item ->
//            ListItemView(
//                imageUrl = item.imageUrl,
//                title = item.title,
//            )
//        }
//    }
}