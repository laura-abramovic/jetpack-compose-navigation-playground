package com.example.composenavigation.navigation.core

import androidx.navigation.NavOptions

interface NavDestination {
    fun screen(): String
    fun navigate(navOptions: NavOptions? = null): String
}