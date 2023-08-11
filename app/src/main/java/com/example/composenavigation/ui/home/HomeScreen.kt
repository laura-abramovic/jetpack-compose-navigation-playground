package com.example.composenavigation.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composenavigation.model.PetSpecies
import com.example.composenavigation.ui.theme.ComposeNavigationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onPetListClick: (String?, PetSpecies?) -> Unit,
    onPetCardClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Home screen")

        val input = rememberSaveable { mutableStateOf("") }

        TextField(
            value = input.value,
            onValueChange = { input.value = it }
        )

        Button(onClick = { onPetListClick("owner Id", PetSpecies.CAT) }) {
            Text(text = "Go to pets list screen")
        }

        Button(onClick = { onPetCardClick(17) }) {
            Text(text = "Go to pets details screen")
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() = ComposeNavigationTheme {
    HomeScreen(
        onPetListClick = { _, _ -> /* no-op */ },
        onPetCardClick = { /* no-op */ }
    )
}