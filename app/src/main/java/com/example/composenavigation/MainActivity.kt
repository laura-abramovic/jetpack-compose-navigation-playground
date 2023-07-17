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
                val navState = navController.currentBackStackEntryAsState()

                NavHost(navController = navController, startDestination = HomeScreenRoute) {
                    composable(HomeScreenRoute) {
                        HomeScreen(onButtonClick = { id ->
                            navController.navigate(detailsScreenRoute(id))
                        })
                    }

                    composable(
                        route = DetailsScreenRoute,
                        arguments = listOf(navArgument(KeyID) { type = NavType.IntType })
                    ) {
                        DetailsScreen(
                            id = it.arguments?.getInt(KeyID)
                                ?: throw IllegalStateException("Details screen must have an argument"),
                            onBackClick = { navController.popBackStack() })
                    }

                    composable(
                        route = PetsScreenRoute,
                        arguments = listOf(
                            navArgument(KeyOwnerId) { nullable = true },
                            navArgument(KeyPetSpecies) {
                                type = NavType.IntType
                                nullable = true
                            }
                        )
                    ) { backStackEntry ->
                        PetsScreen(
                            pets = emptyList(),
                            ownerId = backStackEntry.arguments?.getString(KeyOwnerId),
                            petSpecies = backStackEntry.arguments?.getInt(KeyPetSpecies)?.let {
                                PetSpecies.values()[it]
                            }
                        )
                    }
                }

            }
        }
    }
}
