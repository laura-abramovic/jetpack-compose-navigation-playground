package com.example.composenavigation.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composenavigation.model.Pet
import com.example.composenavigation.model.PetSpecies
import com.example.composenavigation.ui.theme.ComposeNavigationTheme

const val KeyOwnerId = "ownerId"
const val KeyPetSpecies = "petSpecies"
const val PetsScreenRoute = "pets?ownerId={$KeyOwnerId}&petSpecies={$KeyPetSpecies}"

@Composable
fun PetsScreen(
    pets: List<Pet>,
    ownerId: String? = null,
    petSpecies: PetSpecies? = null,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(pets) {

        }
    }

}

@Preview
@Composable
private fun PetScreenPreview() = ComposeNavigationTheme {
    PetsScreen(pets = emptyList())
}