package com.example.composenavigation.ui.screen

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.composenavigation.navigation.BottomNavigationItem
import com.example.composenavigation.ui.theme.LightBlue
import com.example.composenavigation.ui.theme.DarkGreen

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(BottomNavigationItem.Home, BottomNavigationItem.Profile)

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomNavigation(
        backgroundColor = DarkGreen,
        contentColor = LightBlue
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(imageVector = item.icon, contentDescription = item.label)
                },
                label = {
                    Text(item.label)
                },
                selected = item.route == currentRoute,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route)
                        }

                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}