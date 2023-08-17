package com.example.composenavigation.navigation.demo

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DemoBottomNavigationItem (val route: String, val label: String, val icon: ImageVector) {
    object Greetings: DemoBottomNavigationItem("greetings_section", "Greetings", Icons.Default.Home)
    object Profile: DemoBottomNavigationItem("profile_section", "Profile", Icons.Default.Person)
}