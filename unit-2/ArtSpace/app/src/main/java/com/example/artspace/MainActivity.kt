package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.artspace.ui.theme.ArtSpaceTheme
import com.example.artspace.view.ArtWorkScreenView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                ArtWorkScreenView(
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArtWorkScreenViewPreview() {
    ArtSpaceTheme {
        ArtWorkScreenView(
            modifier = Modifier.fillMaxSize(),
        )
    }
}