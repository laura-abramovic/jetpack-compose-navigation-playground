package com.example.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composenavigation.model.PetSpecies
import com.example.composenavigation.ui.screen.DetailsScreen
import com.example.composenavigation.ui.screen.DetailsScreenRoute
import com.example.composenavigation.ui.screen.HomeScreen
import com.example.composenavigation.ui.screen.HomeScreenRoute
import com.example.composenavigation.ui.screen.KeyID
import com.example.composenavigation.ui.screen.KeyOwnerId
import com.example.composenavigation.ui.screen.KeyPetSpecies
import com.example.composenavigation.ui.screen.MainScreen
import com.example.composenavigation.ui.screen.PetsScreen
import com.example.composenavigation.ui.screen.PetsScreenRoute
import com.example.composenavigation.ui.screen.detailsScreenRoute
import com.example.composenavigation.ui.theme.ComposeNavigationTheme
import java.lang.IllegalStateException

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationTheme {

                val navController = rememberNavController()

                MainScreen(navController = navController)
            }
        }
    }
}
