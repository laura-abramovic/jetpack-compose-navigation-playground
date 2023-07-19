package com.example.composenavigation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.composenavigation.ui.home.HomeNavigationRoute
import com.example.composenavigation.ui.profile.ProfileNavigationRoute

sealed class BottomNavigationItem(val route: String, val label: String, val icon: ImageVector) {
    object Home : BottomNavigationItem(HomeNavigationRoute, "Home", Icons.Default.Home)
    object Profile : BottomNavigationItem(ProfileNavigationRoute, "Profile", Icons.Default.Person)
}
