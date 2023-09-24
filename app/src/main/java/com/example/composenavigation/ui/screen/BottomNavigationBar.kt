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
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.composenavigation.navigation.BottomNavigationItem
import com.example.composenavigation.ui.theme.DarkGray
import com.example.composenavigation.ui.theme.LightGray
import com.example.composenavigation.ui.theme.Orange

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(BottomNavigationItem.Greetings, BottomNavigationItem.Profile)

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentHierarchy = navBackStackEntry?.destination?.hierarchy

    println("mojjjj hierarchy: ${currentHierarchy?.toList()?.map { it.route }}")

    BottomNavigation(
        backgroundColor = DarkGray,
        contentColor = LightGray,
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
                selected = currentHierarchy?.any { it.route == item.route } == true,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }

                        restoreState = true
                        launchSingleTop = true
                    }
                },
                selectedContentColor = Orange,
                unselectedContentColor = LightGray
            )
        }
    }
}
