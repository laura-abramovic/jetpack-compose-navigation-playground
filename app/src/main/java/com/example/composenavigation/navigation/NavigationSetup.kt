package com.example.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.composenavigation.ui.home.HomeNavigationRoute
import com.example.composenavigation.ui.home.homeScreen
import com.example.composenavigation.ui.petdetails.navigateToPetDetails
import com.example.composenavigation.ui.petdetails.petDetailsScreen
import com.example.composenavigation.ui.pets.petsScreen
import com.example.composenavigation.ui.profile.profileScreen

@Composable
fun NavigationSetup(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = HomeNavigationRoute,
        modifier = modifier
    ) {
        homeScreen(onButtonClick = { id -> navController.navigateToPetDetails(id) })

        petDetailsScreen(onBackClick = { navController.popBackStack() })

        petsScreen()

        profileScreen(onProfileEditClick = { /* TODO */ })
    }
}