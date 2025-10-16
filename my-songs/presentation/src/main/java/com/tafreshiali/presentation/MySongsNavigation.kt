package com.tafreshiali.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable

@Serializable
data object MysSongsDestination

fun NavGraphBuilder.mySongsScreen() {
    composable<MysSongsDestination> {
        MySongsScreen()
    }
}