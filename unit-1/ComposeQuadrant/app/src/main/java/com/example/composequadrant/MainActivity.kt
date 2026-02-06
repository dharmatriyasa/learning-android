package com.example.composequadrant

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Quadrants(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@SuppressLint("ResourceAsColor")
@Composable
fun Quadrants(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.weight(
                weight = 1f,
                fill = true
            )
        ) {
            Quadrant(
                backgroundColor = colorResource(R.color.first_quadrant_bg),
                title = stringResource(id = R.string.first_quadrant_title),
                description = stringResource(id = R.string.first_quadrant_description),
                modifier = Modifier.weight(1f),
            )
            Quadrant(
                backgroundColor = colorResource(R.color.second_quadrant_bg),
                title = stringResource(id = R.string.second_quadrant_title),
                description = stringResource(id = R.string.second_quadrant_description),
                modifier = Modifier.weight(1f),
            )
        }
        Row(
            modifier = Modifier.weight(
                weight = 1f,
                fill = true
            )
        ) {
            Quadrant(
                backgroundColor = colorResource(R.color.third_quadrant_bg),
                title = stringResource(id = R.string.third_quadrant_title),
                description = stringResource(id = R.string.third_quadrant_description),
                modifier = Modifier.weight(1f),
            )
            Quadrant(
                backgroundColor = colorResource(R.color.fourth_quadrant_bg),
                title = stringResource(id = R.string.fourth_quadrant_title),
                description = stringResource(id = R.string.fourth_quadrant_description),
                modifier = Modifier.weight(1f),
            )
        }
    }
}

@Composable
fun Quadrant(backgroundColor: Color, title: String, description: String, modifier: Modifier) {
    Surface(
        color =  backgroundColor,
        modifier = modifier,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp),
                textAlign = TextAlign.Justify
            )
            Text(
                text = description,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Quadrants(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}