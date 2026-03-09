package com.example.newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.newsapp.models.News

@Composable
fun NewsCardGrid(news: News) {
    Column(
        modifier = Modifier
            .padding(6.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color(0xFFF0F0F0))
    ) {
        AsyncImage(
            model = news.imagen,
            contentDescription = news.titulo,
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = news.titulo,
            fontSize = 13.sp,
            modifier = Modifier.padding(8.dp)
        )
    }
}