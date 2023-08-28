package com.example.composenavigation.ui.screen

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.navigation.demo.profileNavGraph
import com.example.composenavigation.navigation.demo.startNavGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DemoScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            DemoBottomNavigationBar(navController = navController)
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

