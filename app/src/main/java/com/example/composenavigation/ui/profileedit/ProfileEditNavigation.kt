package com.example.composenavigation.ui.profileedit

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

private const val ProfileEditNavigationRoute = "profile_edit_navigation_route"

fun NavController.navigateToProfileEdit(navOptions: NavOptions? = null) {
    navigate(ProfileEditNavigationRoute, navOptions)
}

fun NavGraphBuilder.profileEditScreen(onEditImageClick: () -> Unit) {
    composable(ProfileEditNavigationRoute) {
        ProfileEditScreen(onImageEditClick = onEditImageClick)
    }
}