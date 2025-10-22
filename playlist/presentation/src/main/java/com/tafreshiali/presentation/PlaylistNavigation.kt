package com.tafreshiali.presentation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object PlaylistNavigation

fun NavGraphBuilder.playlistScreen() {
    composable<PlaylistNavigation> {
        PlaylistScreen()
    }
}

fun NavController.navigateToPlaylist() {
    navigate(PlaylistNavigation)
}