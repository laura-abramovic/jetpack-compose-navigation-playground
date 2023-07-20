package com.example.composenavigation.ui.pets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
fun PetsScreen(
    pets: List<Pet>,
    onPetCardClick: (Int) -> Unit,
    modifier: Modifier = Modifier,
    ownerId: String? = null,
    petSpecies: PetSpecies? = null,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Owner ID: $ownerId")
        Text(text = "Pet species: ${petSpecies?.name}")

        Button(onClick = { onPetCardClick(34) }) {
            Text(text = "Go to pet details")
        }
    }
}

@Preview
@Composable
private fun PetScreenPreview() = ComposeNavigationTheme {
    PetsScreen(pets = emptyList(), onPetCardClick = { /* no-op */ })
}