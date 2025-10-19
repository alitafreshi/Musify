package com.tafreshiali.presentation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object ArtistsDestination

fun NavGraphBuilder.artistsScreen() {
    composable<ArtistsDestination> {
        ArtistsScreen()
    }
}

fun NavController.navigateToArtists() {
    navigate(ArtistsDestination)
}