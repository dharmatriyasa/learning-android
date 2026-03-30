package com.example.superheroesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.superheroesapp.ui.theme.SuperheroesAppTheme
import com.example.superheroesapp.ui.theme.Typography
import com.example.superheroesapp.view.HeroesScreen

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperheroesAppTheme {
                Scaffold(
                    topBar = {
                        CenterAlignedTopAppBar(
                            title = {
                                Text(
                                    text = "Superheroes App",
                                    style = Typography.displayLarge,
                                    )
                            },
                        )
                    },
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    HeroesScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
