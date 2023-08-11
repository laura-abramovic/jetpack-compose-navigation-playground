package com.example.composenavigation.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composenavigation.ui.theme.ComposeNavigationTheme
import com.example.composenavigation.ui.theme.Orange

@Composable
fun ScreenA(onGoToScreenBClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Screen A",
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )

        Spacer(modifier = Modifier.height(128.dp))

        Button(
            onClick = onGoToScreenBClick,
            colors = ButtonDefaults.buttonColors(backgroundColor = Orange, contentColor = Color.White),
            contentPadding = PaddingValues(horizontal = 32.dp, vertical = 12.dp)
        ) {
            Text(text = "Go to screen B", fontSize = 24.sp)
        }
    }
}


@Preview(device = Devices.PIXEL_4)
@Composable
private fun ScreenAPreview() = ComposeNavigationTheme {
    ScreenA(onGoToScreenBClick = { /* no-op */ })
}