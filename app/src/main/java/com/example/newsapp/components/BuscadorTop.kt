package com.example.newsapp.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BuscadorTop() {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        placeholder = {
            Text(text = "Buscar")
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "inicio"
            )
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Buscar"
            )
        },
        shape = RoundedCornerShape(50.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp)
    )
}