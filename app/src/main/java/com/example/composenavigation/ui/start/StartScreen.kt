package com.example.composenavigation.ui.start

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composenavigation.ui.components.PrimaryButton
import com.example.composenavigation.ui.theme.ComposeNavigationTheme
import com.example.composenavigation.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(onButtonClick: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .imePadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val text = rememberSaveable { mutableStateOf("") }

        OutlinedTextField(
            value = text.value,
            onValueChange = { text.value = it },
            textStyle = TextStyle.Default.copy(fontSize = 24.sp),
            placeholder = { Text(text = "Name", fontSize = 24.sp) },
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Orange,
                unfocusedIndicatorColor = Color.Black,
                cursorColor = Orange,
            )
        )

        Spacer(modifier = Modifier.height(100.dp))

        PrimaryButton(text = "Greet", onClick = { onButtonClick(text.value) })
    }
}

@Preview
@Composable
private fun StartScreenPreview() = ComposeNavigationTheme {
    StartScreen { /* no-op */ }
}