package com.example.composenavigation.model

data class Pet(
    val id: String,
    val ownerId: String,
    val species: PetSpecies
)

enum class PetSpecies {
    DOG, CAT, FISH
}