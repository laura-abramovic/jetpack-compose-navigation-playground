package com.example.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.ui.screen.MainScreen
import com.example.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(this.window, false)

        setContent {
            ComposeNavigationTheme {

                val navController = rememberNavController()

                MainScreen(navController = navController)
            }
        }
    }
}
