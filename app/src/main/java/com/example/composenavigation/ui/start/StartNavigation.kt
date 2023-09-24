package com.example.composenavigation.ui.start

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

private const val StartScreenRoute = "start_screen_route"

fun NavGraphBuilder.addStartScreen(onButtonClick: (String) -> Unit) {
    composable(StartScreenRoute) {
        StartScreen(onButtonClick)
    }
}

fun NavController.navigateToStartDestination(navOptions: NavOptions? = null) {
    navigate(StartScreenRoute, navOptions)
}