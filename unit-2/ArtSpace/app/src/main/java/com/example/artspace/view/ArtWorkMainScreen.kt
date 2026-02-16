package com.example.artspace.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.artspace.viewmodel.ArtWorkViewModel

@Composable
fun ArtWorkScreenView(
    modifier: Modifier = Modifier,
    viewModel: ArtWorkViewModel = viewModel(),
) {
    val item = viewModel.currentItem

    Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp,
                start = 24.dp,
                end = 24.dp
            ),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            ArtWorkImageView(
                modifier = Modifier.padding(innerPadding),
                artImage = item.artImage,
                title = item.title,
            )

            Column(
                modifier = modifier.padding(
                    vertical = 36.dp,
                ),
                verticalArrangement = Arrangement.Bottom
            ) {
                ArtWorkDescriptionView(
                    title = item.title,
                    artist = item.artist,
                    year = item.year,
                )
                Spacer(modifier = Modifier.height(36.dp))
                ArtWorkButtonView(viewModel = viewModel)
            }
        }
    }
}

@Composable
private fun ArtWorkImageView(
    modifier: Modifier = Modifier,
    @DrawableRes artImage: Int,
    title: String,
) {
    Surface(
        modifier = modifier
            .padding(
                top = 60.dp,
            )
            .height(450.dp)
            .fillMaxSize(),
        shadowElevation = 8.dp,
    ) {
        Image(
            modifier = Modifier.padding(all = 32.dp),
            painter = painterResource(artImage),
            contentDescription = title,
        )
    }
}

@Composable
private fun ArtWorkDescriptionView(
    modifier: Modifier = Modifier,
    title: String,
    artist: String,
    year: String,
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        color = Color(0xFFbac2e3),
    ) {
        Column(
            modifier = modifier.padding(
                vertical = 18.dp,
                horizontal = 4.dp,
            ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = title,
                fontSize = 24.sp,
                fontWeight = FontWeight.W300
            )
            Row {
                Text(
                    text = artist,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "($year)",
                    fontSize = 14.sp,
                    fontStyle = FontStyle.Italic,
                )
            }
        }
    }
}

@Composable
private fun ArtWorkButtonView(
    modifier: Modifier = Modifier,
    viewModel: ArtWorkViewModel,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CommonButtonView(
            title = "Previous"
        ) {
            viewModel.previous()
        }
        CommonButtonView(
            title = "Next"
        ) {
            viewModel.next()
        }
    }
}

@Composable
private fun CommonButtonView(
    modifier: Modifier = Modifier,
    title: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.width(150.dp),
        onClick = onClick,
    ) {
        Text(text = title)
    }
}

