package com.example.composenavigation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.model.BottomNavigationItemState
import com.example.composenavigation.model.BottomNavigationItem
import com.example.composenavigation.navigation.profileNavGraph
import com.example.composenavigation.navigation.startNavGraph
import com.example.composenavigation.ui.components.BottomNavigationBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    val bottomNavigationItems = listOf(BottomNavigationItem.Greetings, BottomNavigationItem.Profile)

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentHierarchy = navBackStackEntry?.destination?.hierarchy

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                items = bottomNavigationItems.map { item ->
                    BottomNavigationItemState(
                        item = item,
                        isSelected = currentHierarchy?.any { it.route == item.route } == true
                    )
                },
                onItemClick = { item ->
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }

                        restoreState = true
                        launchSingleTop = true
                    }
                }
            )
        },
    ) {
        NavHost(
            navController = navController,
            startDestination = "greetings_graph"
        ) {
            startNavGraph(navController)
            profileNavGraph(navController)
        }
    }
}

