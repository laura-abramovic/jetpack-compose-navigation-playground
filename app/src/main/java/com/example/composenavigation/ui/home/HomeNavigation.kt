package com.example.composenavigation.ui.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val HomeNavigationRoute = "home_screen_route"

fun NavController.navigateToHome(navOptions: NavOptions? = null) {
    this.navigate(HomeNavigationRoute, navOptions)
}

fun NavGraphBuilder.homeScreen(onButtonClick: (Int) -> Unit) {
    composable(route = HomeNavigationRoute) {
        HomeScreen(onButtonClick = onButtonClick)
    }
}