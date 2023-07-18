package com.example.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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
import com.example.composenavigation.ui.screen.ProfileScreen
import com.example.composenavigation.ui.screen.ProfileScreenRoute
import com.example.composenavigation.ui.screen.detailsScreenRoute

@Composable
fun NavigationSetup(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = HomeScreenRoute,
        modifier = modifier
    ) {
        composable(HomeScreenRoute) {
            HomeScreen(
                onButtonClick = { id -> navController.navigate(detailsScreenRoute(id)) }
            )
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
                    defaultValue = -1
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

        composable(ProfileScreenRoute) { ProfileScreen(onProfileEditClick = { /*TODO*/ }) }
    }
}