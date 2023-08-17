package com.example.composenavigation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composenavigation.ui.greetings.GreetingsScreen
import com.example.composenavigation.ui.greetings.StartScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DemoScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            DemoBottomNavigationBar(navController = navController)
        },
    ) {
        NavHost(
            navController = navController,
            startDestination = "start_screen_route"
        ) {
            composable("start_screen_route") {
                StartScreen(onButtonClick = { input ->
                    navController.navigate("greetings_screen_route/$input")
                })
            }

            composable(
                route = "greetings_screen_route/{name}",
                arguments = listOf(navArgument("name") {
                    type = NavType.StringType
                    nullable = true
                    defaultValue = "user"
                })
            ) { backStackEntry ->
                GreetingsScreen(
                    onBackClick = { navController.popBackStack() },
                    name = backStackEntry.arguments?.getString("name") ?: ""
                )
            }
        }
    }
}

