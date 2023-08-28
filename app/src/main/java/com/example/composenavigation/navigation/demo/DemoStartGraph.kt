package com.example.composenavigation.navigation.demo

import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.composenavigation.ui.greetings.GreetingsScreen
import com.example.composenavigation.ui.greetings.StartScreen

fun NavGraphBuilder.startNavGraph(navController: NavHostController) {
    navigation(
        startDestination = "start_screen_route",
        route = "greetings_graph"
    ) {
        composable("start_screen_route") {
            StartScreen(onButtonClick = { input ->
                navController.navigate("greetings_screen_route/$input") {

                }
            })
        }

        composable(
            route = "greetings_screen_route/{name}",
            arguments = listOf(navArgument("name") { type = androidx.navigation.NavType.StringType }),
            deepLinks = listOf(
                NavDeepLink("scheme://host/greetings/{name}")
            )
        ) { backStackEntry ->
            GreetingsScreen(
                onBackClick = { navController.popBackStack() },
                name = backStackEntry.arguments?.getString("name") ?: ""
            )
        }
    }
}