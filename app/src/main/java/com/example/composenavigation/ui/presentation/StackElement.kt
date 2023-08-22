package com.example.composenavigation.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composenavigation.ui.theme.ComposeNavigationTheme
import com.example.composenavigation.ui.theme.LightBlue

@Composable
fun StackElement(name: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(LightBlue)
            .padding(vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = name,
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
        )
    }
}

@Preview
@Composable
private fun StackElementAPreview() = ComposeNavigationTheme {
//    StackElement(name = "Screen A")
    StackElement(name = "Greetings")
}

@Preview
@Composable
private fun StackElementBPreview() = ComposeNavigationTheme {
//    StackElement(name = "Screen B")
    StackElement(name = "Profile")
}