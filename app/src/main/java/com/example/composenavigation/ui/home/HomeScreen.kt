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
import com.example.composenavigation.model.Pet
import com.example.composenavigation.model.PetSpecies
import com.example.composenavigation.ui.theme.ComposeNavigationTheme

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