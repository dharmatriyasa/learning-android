package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                Scaffold(
                    topBar = {
                        CenterAlignedTopAppBar(
                            title = {
                                Text(
                                    text = stringResource(R.string.app_name),
                                    fontWeight = FontWeight.Bold
                                )
                            },
                            colors = TopAppBarDefaults.largeTopAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer
                            )
                        )
                    },
                    modifier = Modifier.fillMaxSize(),
                    ) { innerPadding ->
                    LemonadeApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun LemonadeApp(modifier: Modifier = Modifier) {
    LemonadeSectionStateful(
        modifier = modifier
    )
}

@Composable
fun LemonadeSectionStateful(
    modifier: Modifier = Modifier,
) {
    var squeezeCount = 0
    var state by remember { mutableIntStateOf(1) }

    val lemonadeState = when (state) {
        1 -> LemonadeState(
            R.drawable.lemon_tree,
            stringResource(R.string.lemon_tree_title),
            stringResource(R.string.lemon_tree_description),
            1,
        )
        2 -> LemonadeState(
            R.drawable.lemon_squeeze,
            stringResource(R.string.lemon_title),
            stringResource(R.string.squeeze_lemon_description),
            (2..4).random(),
        )
        3 -> LemonadeState(
            R.drawable.lemon_drink,
            stringResource(R.string.glass_of_lemonade_title),
            stringResource(R.string.drink_lemonade_description),
            1,
        )
        else -> LemonadeState(
            R.drawable.lemon_restart,
            stringResource(R.string.empty_glass_title),
            stringResource(R.string.start_again_description),
            1,
        )
    }

    LemonadeSection(
        modifier = modifier,
        lemonadeState = lemonadeState,
        onClick = {
            if (state == 2) {
                squeezeCount++
                if (squeezeCount >= lemonadeState.showCount) {
                    state++
                    squeezeCount = 0
                }
            } else {
                state = if (state < 4) state + 1 else 1
            }
        }
    )
}

@Composable
fun LemonadeSection(
    modifier: Modifier = Modifier,
    lemonadeState: LemonadeState,
    onClick: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
            onClick = onClick
        ) {
            Image(
                painterResource(lemonadeState.imageAssetId),
                contentDescription = lemonadeState.contentDescription,
            )
        }
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Text(
            lemonadeState.textDescription
        )
    }
}

class LemonadeState(
    val imageAssetId: Int,
    val contentDescription: String,
    val textDescription: String,
    val showCount: Int,
)