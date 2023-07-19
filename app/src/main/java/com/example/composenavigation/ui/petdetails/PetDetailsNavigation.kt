package com.example.composenavigation.ui.petdetails

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

private const val PetId = "petId"
private const val PetDetailsNavigationBaseRoute = "pet_details_screen_route"

fun NavController.navigateToPetDetails(id: Int, navOptions: NavOptions? = null) {
    this.navigate("$PetDetailsNavigationBaseRoute/$id", navOptions)
}

fun NavGraphBuilder.petDetailsScreen(onBackClick: () -> Unit) {
    composable(
        route = "$PetDetailsNavigationBaseRoute/{$PetId}",
        arguments = listOf(navArgument(PetId) { type = NavType.IntType })
    ) {
        PetDetailsScreen(
            id = it.arguments?.getInt(PetId)
                ?: throw IllegalStateException("Details screen must have an argument"),
            onBackClick = onBackClick
        )
    }
}