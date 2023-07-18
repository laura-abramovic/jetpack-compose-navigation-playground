package com.example.composenavigation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.composenavigation.ui.screen.HomeScreenRoute
import com.example.composenavigation.ui.screen.ProfileScreenRoute

sealed class BottomNavigationItem(val route: String, val label: String, val icon: ImageVector) {
    object Home: BottomNavigationItem(HomeScreenRoute, "Home", Icons.Default.Home)
    object Profile: BottomNavigationItem(ProfileScreenRoute, "Profile", Icons.Default.Person)
}
