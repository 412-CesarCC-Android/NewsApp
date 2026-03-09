package com.example.newsapp.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TabsNoticias() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
    ) {
        Text(
            text = "Noticias",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 8.dp)
        )

        Text(
            text = "Eventos",
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Gray,
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 8.dp)
        )

        Text(
            text = "Clima",
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Gray,
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 8.dp)
        )
    }
}