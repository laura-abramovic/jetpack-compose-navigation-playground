package com.example.composenavigation.ui.pets

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.composenavigation.model.PetSpecies
import com.example.composenavigation.util.createOptionalParams

private const val KeyOwnerId = "ownerId"
private const val KeyPetSpecies = "petSpecies"
private const val PetsNavigationBaseRoute = "pets_screen_route"

private const val PetSpeciesDefaultOrdinal = -1

fun NavController.navigateToPetsScreen(ownerId: String? = null, petSpecies: PetSpecies? = null) {
    val queryParams = createOptionalParams(
        listOf(
            KeyOwnerId to ownerId,
            KeyPetSpecies to petSpecies?.ordinal
        )
    )

    navigate("$PetsNavigationBaseRoute$queryParams")
}

fun NavGraphBuilder.petsScreen(onPetCardClick: (Int) -> Unit) {
    composable(
        route = "$PetsNavigationBaseRoute?$KeyOwnerId={$KeyOwnerId}&$KeyPetSpecies={$KeyPetSpecies}",
        arguments = listOf(
            navArgument(KeyOwnerId) {
                type = NavType.StringType
                nullable = true
            },
            navArgument(KeyPetSpecies) {
                type = NavType.IntType
                defaultValue = PetSpeciesDefaultOrdinal
            }
        )
    ) { backStackEntry ->
        PetsScreen(
            pets = emptyList(),
            onPetCardClick = onPetCardClick,
            ownerId = backStackEntry.arguments?.getString(KeyOwnerId),
            petSpecies = backStackEntry.arguments?.getInt(KeyPetSpecies)?.let {
                if (it != PetSpeciesDefaultOrdinal) PetSpecies.values()[it] else null
            }
        )
    }
}