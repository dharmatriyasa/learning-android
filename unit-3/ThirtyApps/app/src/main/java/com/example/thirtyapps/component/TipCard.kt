package com.example.thirtyapps.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtyapps.R
import com.example.thirtyapps.model.Tip
import com.example.thirtyapps.ui.theme.Shapes
import com.example.thirtyapps.ui.theme.Typography

@Composable
fun TipCard(
    modifier: Modifier = Modifier,
    tip: Tip,
) {
    var tapped by remember { mutableStateOf<Boolean>(false) }

    fun onCardTapped() {
        tapped = !tapped
    }

    fun getBorder(): BorderStroke? {
        return if (tapped) BorderStroke(
            width =  1.dp,
            brush = SolidColor(Color.Red),
        )
        else null
    }

    Card(
        modifier.fillMaxSize(1f).clickable(
            onClick = { onCardTapped() },
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp,
        ),
        shape = Shapes.medium,
        border = getBorder(),
    ) {
        Column(
            modifier = Modifier,
        ) {
            Image(
                painter = painterResource(tip.imagePath),
                contentDescription = tip.title,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop,
            )
            Text(
                modifier = Modifier.padding(
                    start = 8.dp,
                    end = 8.dp,
                    top = 4.dp,
                ),
                text = tip.title,
                style = Typography.titleMedium,
            )
            Text(
                modifier = Modifier.padding(
                    start = 8.dp,
                    end = 8.dp,
                    top = 8.dp,
                    bottom = 8.dp,
                ),
                text = tip.description,
                style = Typography.bodySmall,
            )
        }
    }
}

@Preview
@Composable
fun TipCardPreview() {
    val tip = Tip(
        title = "Start With Warm-Up",
        description = "Always begin your workout with a 5–10 minute warm-up to prepare your muscles and prevent injury.",
        imagePath = R.drawable.mountain_red
    )
    TipCard(tip = tip)
}