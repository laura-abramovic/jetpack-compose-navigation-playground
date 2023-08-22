package com.example.composenavigation.navigation.demo

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DemoBottomNavigationItem(
    val route: String,
    val icon: ImageVector
) {
    object Greetings: DemoBottomNavigationItem(
        "start_screen_route",
        Icons.Default.Home
    )
    object Profile: DemoBottomNavigationItem(
        "profile_screen_route",
        Icons.Default.Person
    )

    object Call: DemoBottomNavigationItem(
        "call_screen_route",
        Icons.Default.Call
    )
}