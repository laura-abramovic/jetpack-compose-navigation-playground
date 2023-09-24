package com.example.composenavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.example.composenavigation.ui.profile.addProfileScreen

const val ProfileGraphRoute = "profile_graph"

fun NavGraphBuilder.profileNavGraph(navController: NavHostController) {
    navigation(
        startDestination = "profile_screen_route",
        route = ProfileGraphRoute
    ) {
        addProfileScreen()
    }
}