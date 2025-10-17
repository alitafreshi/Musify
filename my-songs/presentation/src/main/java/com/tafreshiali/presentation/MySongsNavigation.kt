package com.tafreshiali.presentation

import androidx.navigation.NavController
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

fun NavController.navigateToMySongs() {
    navigate(MysSongsDestination)
}