package com.example.composenavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.example.composenavigation.ui.home.HomeNavigationRoute
import com.example.composenavigation.ui.home.homeScreen
import com.example.composenavigation.ui.petdetails.navigateToPetDetails
import com.example.composenavigation.ui.petdetails.petDetailsScreen
import com.example.composenavigation.ui.pets.navigateToPetsScreen
import com.example.composenavigation.ui.pets.petsScreen

const val HomeNavGraphRoute = "home_nav_graph"

fun NavGraphBuilder.homeNavGraph(navController: NavHostController) {
    navigation(
        startDestination = HomeNavigationRoute,
        route = HomeNavGraphRoute
    ) {
        homeScreen(
            onPetListClick = { ownerId, petSpecies -> navController.navigateToPetsScreen(ownerId, petSpecies) },
            onPetCardClick = { id -> navController.navigateToPetDetails(id) }
        )

        petDetailsScreen(
            onBackClick = { navController.popBackStack() },
            onGoHomeClick = { navController.popBackStack(route = HomeNavigationRoute, inclusive = false) }
        )

        petsScreen(onPetCardClick = { id -> navController.navigateToPetDetails(id) })
    }
}