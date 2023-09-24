package com.example.composenavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.example.composenavigation.ui.greetings.addGreetingsScreen
import com.example.composenavigation.ui.greetings.navigateToGreetingsScreen
import com.example.composenavigation.ui.start.addStartScreen

const val StartGraphRoute = "greetings_graph"

fun NavGraphBuilder.startNavGraph(navController: NavHostController) {
    navigation(
        startDestination = "start_screen_route",
        route = StartGraphRoute
    ) {
        addStartScreen(onButtonClick = { input -> navController.navigateToGreetingsScreen(input) })

        addGreetingsScreen(onBackClick = { navController.popBackStack() })
    }
}