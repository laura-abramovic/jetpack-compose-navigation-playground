package com.example.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composenavigation.ui.greetings.GreetingsScreen
import com.example.composenavigation.ui.greetings.StartScreen
import com.example.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(this.window, false)

        setContent {
            ComposeNavigationTheme {

//                MainScreen(navController = navController)

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "start_screen_route"
                ) {
                    composable("start_screen_route") {
                        StartScreen(onButtonClick = { input ->
                            navController.navigate("greetings_screen_route/$input") {
//                                restoreState = true
                            }
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
    }
}
