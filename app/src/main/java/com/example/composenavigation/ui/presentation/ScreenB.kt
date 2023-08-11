package com.example.composenavigation.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composenavigation.ui.theme.ComposeNavigationTheme
import com.example.composenavigation.ui.theme.LightGray2


@Composable
fun ScreenB() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(LightGray2),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Screen B",
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )
    }
}

@Preview(device = Devices.PIXEL_4)
@Composable
private fun ScreenBPreview() = ComposeNavigationTheme {
    ScreenB()
}