package com.example.composenavigation.ui.home

import androidx.navigation.NavController
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.composenavigation.model.PetSpecies
import com.example.composenavigation.navigation.AppUri

const val HomeNavigationRoute = "home_screen_route"
private const val HomeScreenDeeplinkUri = "$AppUri/home"

fun NavController.navigateToHome(navOptions: NavOptions? = null) {
    this.navigate(HomeNavigationRoute, navOptions)
}

fun NavGraphBuilder.homeScreen(
    onPetListClick: (String?, PetSpecies?) -> Unit,
    onPetCardClick: (Int) -> Unit
) {
    composable(
        route = HomeNavigationRoute,
        deepLinks = listOf(NavDeepLink(HomeScreenDeeplinkUri))
    ) {
        HomeScreen(
            onPetListClick = onPetListClick,
            onPetCardClick = onPetCardClick,
        )
    }
}