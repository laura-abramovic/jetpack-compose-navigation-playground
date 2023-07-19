package com.example.composenavigation.ui.profile

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val ProfileNavigationRoute = "profile_screen_route"

fun NavController.navigateToProfile(navOptions: NavOptions? = null) {
    this.navigate(ProfileNavigationRoute, navOptions)
}

fun NavGraphBuilder.profileScreen(onProfileEditClick: () -> Unit) {
    composable(ProfileNavigationRoute) {
        ProfileScreen(onProfileEditClick = onProfileEditClick)
    }
}
