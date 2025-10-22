package com.tafreshiali.presentation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object FavoritesNavigation

fun NavGraphBuilder.favoritesScreen() {
    composable<FavoritesNavigation> {
        FavoritesScreen()
    }
}

fun NavController.navigateToFavorites() {
    navigate(FavoritesNavigation)
}