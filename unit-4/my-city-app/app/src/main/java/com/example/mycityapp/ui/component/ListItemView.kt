package com.example.mycityapp.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.mycityapp.data.ItemType

@Composable
fun ListItemView(
    imageUrl: String,
    title: String,
    onListTapped: (itemType: ItemType) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.padding(
            vertical = 4.dp,
            horizontal = 4.dp,
        ).clickable {

        }
    ) {
        AsyncImage(
            model = imageUrl,
            contentDescription = title,
        )
        Text(
            text = title,
            modifier = Modifier.padding(
                top = 8.dp
            ),
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            style = MaterialTheme.typography.titleMedium,
            color = Color.Black,
        )
    }
}
