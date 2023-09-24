package com.example.composenavigation.ui.greetings

import androidx.navigation.NavController
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

private const val GreetingScreenBaseRoute = "greetings_screen_route"
private const val ParameterName = "name"

fun NavGraphBuilder.addGreetingsScreen(onBackClick: () -> Unit) {
    composable(
        route = "$GreetingScreenBaseRoute/{$ParameterName}",
        arguments = listOf(navArgument(ParameterName) { type = NavType.StringType }),
        deepLinks = listOf(
            NavDeepLink("scheme://host/greetings/{name}")
        )
    ) { backStackEntry ->
        GreetingsScreen(
            onBackClick = onBackClick,
            name = backStackEntry.arguments?.getString(ParameterName).orEmpty()
        )
    }
}

fun NavController.navigateToGreetingsScreen(name: String, navOptions: NavOptions? = null) {
    navigate("$GreetingScreenBaseRoute/$name", navOptions)
}
