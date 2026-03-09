package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.components.BuscadorTop
import com.example.newsapp.components.NewsCardGRande
import com.example.newsapp.components.TabsNoticias
import com.example.newsapp.models.newsList
import com.example.newsapp.ui.theme.NewsAppTheme
import androidx.compose.foundation.lazy.items

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PantallasNoticias(innerPadding)
                }
            }
        }
    }
}

@Composable
fun PantallasNoticias(innerPadding: PaddingValues) {
    val colors = MaterialTheme.colorScheme

    Column(modifier = Modifier
        .fillMaxSize()
        .background(colors.background)
        .padding(innerPadding)
        .padding(horizontal = 16.dp)
    ) {
        BuscadorTop()
        TabsNoticias()

        Text(
            text = "Ultimas noticias",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
        )
        LazyRow {
            items(newsList){ news ->
                NewsCardGRande(news = news)
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun PantallaNoticiasPreview() {
    NewsAppTheme {
        PantallasNoticias(innerPadding = PaddingValues(0.dp))
    }
}