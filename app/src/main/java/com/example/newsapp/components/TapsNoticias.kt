package com.example.newsapp.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newsapp.ui.theme.NewsAppTheme


@Composable
fun TabsNoticias() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding()
    ) {
        Text(
            text = "Noticias",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier
                .weight(1f)
                .padding(vertical  =8.dp)
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
@Preview(showBackground = true, showSystemUi = true)


@Composable
fun noticiaspreview(){
    NewsAppTheme {
        TabsNoticias()
    }
}
