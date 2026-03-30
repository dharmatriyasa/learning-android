package com.example.superheroesapp.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroesapp.R
import com.example.superheroesapp.ui.theme.Typography

@Composable
fun HeroCardView(
    modifier: Modifier = Modifier,
    title: String,
    description: String,
    @DrawableRes heroImage: Int,
) {
    Card(
        modifier.padding(
            vertical = 8.dp,
            horizontal = 16.dp,
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier.padding(all = 16.dp).height(72.dp)
        ) {
            Column(
                modifier = Modifier.padding(end = 16.dp).height(72.dp).weight(1f)
            ) {
                Text(
                    text = title,
                    style = Typography.displaySmall
                )
                Text(
                    text = description,
                    style = Typography.bodyLarge,
                )
            }
            Image(
                modifier = Modifier.size(72.dp).clip(RoundedCornerShape(8.dp)),
                painter = painterResource(heroImage),
                contentDescription = title,
            )
        }
    }
}

@Preview
@Composable
fun HeroCardViewPreview() {
    HeroCardView(
        modifier = Modifier,
        title = "Dharma Ganteng",
        description = "Dharma Ganteng Banget Hehe Huhu HUhu",
        heroImage = R.drawable.android_superhero1,
    )
}