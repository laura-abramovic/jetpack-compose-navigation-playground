package com.example.composenavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.example.composenavigation.ui.profile.ProfileNavigationRoute
import com.example.composenavigation.ui.profile.profileScreen
import com.example.composenavigation.ui.profileedit.navigateToProfileEdit
import com.example.composenavigation.ui.profileedit.profileEditScreen

const val ProfileNavGraphRoute = "profile_nav_graph"

fun NavGraphBuilder.profileNavGraph(navController: NavHostController) {
    navigation(
        startDestination = ProfileNavigationRoute,
        route = ProfileNavGraphRoute
    ) {
        profileScreen(onProfileEditClick = { navController.navigateToProfileEdit() })

        profileEditScreen(onEditImageClick = { /* TODO */ })
    }
}