package com.example.composenavigation.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.composenavigation.navigation.ProfileGraphRoute
import com.example.composenavigation.navigation.StartGraphRoute

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