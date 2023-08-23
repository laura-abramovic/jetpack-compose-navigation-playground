package com.example.composenavigation.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.composenavigation.navigation.demo.DemoBottomNavigationItem
import com.example.composenavigation.ui.theme.DarkGray
import com.example.composenavigation.ui.theme.LightGray2

@Composable
fun DemoBottomNavigationBar(navController: NavController) {
    val items = listOf(DemoBottomNavigationItem.Greetings, DemoBottomNavigationItem.Profile)

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    BottomNavigation(
        backgroundColor = DarkGray,
        contentColor = LightGray2,
        modifier = Modifier
            .background(DarkGray)
            .navigationBarsPadding()
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = null,
                        modifier = Modifier.size(32.dp)
                    )
                },
                selected = item.route == currentRoute,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id)

                        launchSingleTop = true
                    }
                }
            )
        }
    }

}

//                    {
//                        popUpTo(navController.graph.findStartDestination().id) {
//                            saveState = true
//                        }
//
//                        launchSingleTop = true
//                        restoreState = true
//                    }
