package com.example.composenavigation.navigation.demo

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation

fun NavGraphBuilder.startNavGraph(navController: NavHostController) {
    navigation(
        startDestination = "start_screen_route",
        route = "greetings_graph"
    ) {
        startDestination(onButtonClick = { input -> navController.navigateToGreetingsScreen(input) })

        greetingsDestination(onBackClick = { navController.popBackStack() })
    }
}