package com.example.composenavigation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationItem(
    val route: String,
    val icon: ImageVector
) {
    object Greetings: BottomNavigationItem(
        StartGraphRoute,
        Icons.Default.Home
    )
    object Profile: BottomNavigationItem(
        ProfileGraphRoute,
        Icons.Default.Person
    )
}