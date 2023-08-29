package com.example.composenavigation.navigation.demo

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.composenavigation.ui.greetings.StartScreen

fun NavGraphBuilder.startDestination(onButtonClick: (String) -> Unit) {
    composable("start_screen_route") {
        StartScreen(onButtonClick)
    }
}

fun NavController.navigateToStartDestination(navOptions: NavOptions? = null) {
    navigate("start_screen_route")
}