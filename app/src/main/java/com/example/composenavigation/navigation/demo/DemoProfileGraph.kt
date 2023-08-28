package com.example.composenavigation.navigation.demo

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.composenavigation.ui.greetings.DemoProfileScreen

fun NavGraphBuilder.profileNavGraph(navController: NavHostController) {
    navigation(
        startDestination = "profile_screen_route",
        route = "profile_graph"
    ) {
        composable(
            route = "profile_screen_route",
        ) {
            DemoProfileScreen()
        }

    }
}