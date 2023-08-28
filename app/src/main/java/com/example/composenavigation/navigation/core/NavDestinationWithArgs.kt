package com.example.composenavigation.navigation.core

import androidx.navigation.NavOptions

interface NavDestinationWithArgs<T: Any> {
    fun screen(): String
    fun navigate(args: T, navOptions: NavOptions? = null)
}