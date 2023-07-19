package com.example.composenavigation.util

fun createOptionalParams(params: List<Pair<String, Any?>>): String {
    val query = params.filter { it.second != null }.joinToString("&") { (key, value) -> "$key=$value" }

    return if (query.isNotEmpty()) "?$query" else ""
}