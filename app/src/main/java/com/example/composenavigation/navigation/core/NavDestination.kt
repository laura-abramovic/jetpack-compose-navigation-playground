package com.example.composenavigation.navigation.core

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions

abstract class NavDestination<T: Any, V: Any> {

    abstract val route: String

    abstract fun NavController.navigate(argument: T, navOptions: NavOptions? = null)

    abstract fun NavGraphBuilder.screen(actions: V)
}