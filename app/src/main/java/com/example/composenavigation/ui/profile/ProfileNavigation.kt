package com.example.composenavigation.ui.profile

import androidx.navigation.NavController
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.example.composenavigation.navigation.AppUri

const val ProfileNavigationRoute = "profile_screen_route"
private const val ProfileScreenDeeplinkUri = "$AppUri/profile"

fun NavController.navigateToProfile(navOptions: NavOptions? = null) {
    this.navigate(ProfileNavigationRoute, navOptions)
}

fun NavGraphBuilder.profileScreen(onProfileEditClick: () -> Unit) {
    composable(
        route = ProfileNavigationRoute,
        deepLinks = listOf(NavDeepLink(ProfileScreenDeeplinkUri))
    ) {
        ProfileScreen(onProfileEditClick = onProfileEditClick)
    }
}
