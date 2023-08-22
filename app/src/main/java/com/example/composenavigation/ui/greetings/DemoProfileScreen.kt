package com.example.composenavigation.ui.greetings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composenavigation.ui.theme.ComposeNavigationTheme
import com.example.composenavigation.ui.theme.DarkGray
import com.example.composenavigation.ui.theme.LightGray

@Composable
fun DemoProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.padding(80.dp))

        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = null,
            tint = DarkGray,
            modifier = Modifier
                .background(LightGray, CircleShape)
                .padding(40.dp)
                .size(80.dp)
        )

        Spacer(modifier = Modifier.padding(20.dp))

        Text(text = "Username", fontSize = 28.sp, fontWeight = FontWeight.Bold)
    }
}

@Preview
@Composable
private fun DemoProfileScreenPreview() = ComposeNavigationTheme {
    DemoProfileScreen()
}