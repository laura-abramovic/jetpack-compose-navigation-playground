package com.example.composenavigation.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composenavigation.ui.theme.ComposeNavigationTheme
import com.example.composenavigation.ui.theme.Orange

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = Orange, contentColor = Color.White),
        contentPadding = PaddingValues(horizontal = 32.dp, vertical = 12.dp),
        modifier = modifier
    ) {
        Text(text = text, fontSize = 24.sp)
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() = ComposeNavigationTheme {
    PrimaryButton(text = "Click me", onClick = { /* no-op */ })
}