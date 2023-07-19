package com.example.composenavigation.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composenavigation.ui.theme.ComposeNavigationTheme

@Composable
fun HomeScreen(onButtonClick: (Int) -> Unit, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Home screen")

        Button(onClick = { onButtonClick(17) }) {
            Text(text = "Go to details screen")
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() = ComposeNavigationTheme {
    HomeScreen(onButtonClick = { /* no-op */ })
}