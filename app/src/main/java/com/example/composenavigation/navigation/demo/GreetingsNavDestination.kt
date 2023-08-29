package com.example.composenavigation.navigation.demo

import androidx.navigation.NavController
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.composenavigation.ui.greetings.GreetingsScreen

fun NavGraphBuilder.greetingsDestination(onBackClick: () -> Unit) {
    composable(
        route = "greetings_screen_route/{name}",
        arguments = listOf(navArgument("name") { type = NavType.StringType }),
        deepLinks = listOf(
            NavDeepLink("scheme://host/greetings/{name}")
        )
    ) { backStackEntry ->
        GreetingsScreen(
            onBackClick = onBackClick,
            name = backStackEntry.arguments?.getString("name") ?: ""
        )
    }
}

fun NavController.navigateToGreetingsScreen(name: String, navOptions: NavOptions? = null) {
    navigate("greetings_screen_route/$name", navOptions)
}
