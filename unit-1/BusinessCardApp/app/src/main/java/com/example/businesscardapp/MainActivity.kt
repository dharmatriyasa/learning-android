package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = colorResource(R.color.green_background_color)
                ) { innerPadding ->
                    ProfileInfoCard(innerPadding)
                }
            }
        }
    }
}

@Composable
fun ProfileInfoCard(innerPadding: PaddingValues) {
    Surface(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(),
        color = colorResource(R.color.green_background_color)
    ) {
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfileCard(
                name = stringResource(R.string.user_name),
                title = stringResource(R.string.title),
            )
            Spacer(Modifier.height(240.dp))
            CardInfo(
                modifier = Modifier.padding(bottom = 24.dp)
            )
        }
    }
}

@Composable
fun ProfileCard(name: String, title: String, modifier: Modifier = Modifier) {
    val profileImage = painterResource(R.drawable.android_logo)
    Column(
        modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            modifier = Modifier.padding(all = 16.dp).width(120.dp),
            color = colorResource(R.color.black_background_color),
        ) {
            Image(
                painter = profileImage,
                contentDescription = null
            )
        }
        Text(
            text = name,
            fontSize = 36.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 8.dp),
            color = colorResource(R.color.green_text_color)
        )
    }
}

@Composable
fun Tile(icon: ImageVector, text: String) {
    Row(
        modifier = Modifier.padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            icon,
            contentDescription = null,
            tint = colorResource(R.color.green_text_color)
        )
        Spacer(
            Modifier.width(30.dp)
        )
        Text(
            text = text,
            fontSize = 16.sp,
        )
    }
}

@Composable
fun CardInfo(modifier: Modifier = Modifier) {
    Column(
        modifier,
    ) {
        Tile(
            icon = Icons.Default.Phone,
            text = stringResource(R.string.phone_number)
        )
        Tile(
            icon = Icons.Default.Share,
            text = stringResource(R.string.social_media)
        )
        Tile(
            icon = Icons.Default.Email,
            text = stringResource(R.string.email)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = colorResource(R.color.green_background_color)
        ) { innerPadding ->
            ProfileInfoCard(innerPadding)
        }
    }
}