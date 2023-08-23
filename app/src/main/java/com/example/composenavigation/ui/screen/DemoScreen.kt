package com.example.composenavigation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDeepLink
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composenavigation.ui.greetings.DemoProfileScreen
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
                arguments = listOf(navArgument("name") {}),
                deepLinks = listOf(
                    NavDeepLink("scheme://host/greetings/{name}")
                )
            ) { backStackEntry ->
                GreetingsScreen(
                    onBackClick = { navController.popBackStack() },
                    name = backStackEntry.arguments?.getString("name") ?: ""
                )
            }

            composable("profile_screen_route") {
                DemoProfileScreen()
            }

            composable("call_screen_route") {
                Text("CALL SCREEN")
            }
        }
    }
}

