package com.example.composenavigation.ui.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

private const val ProfileScreenRoute = "profile_screen_route"

fun NavGraphBuilder.addProfileScreen() {
    composable(route = ProfileScreenRoute) {
        ProfileScreen()
    }
}