package com.example.composenavigation.ui.profile

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
fun ProfileScreen(
    onProfileEditClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Profile screen")

        Button(onClick = onProfileEditClick) {
            Text(text = "Edit profile")
        }
    }
}

@Preview
@Composable
private fun ProfileScreenPreview() = ComposeNavigationTheme {
    ProfileScreen(onProfileEditClick = { /* no-op */ })
}