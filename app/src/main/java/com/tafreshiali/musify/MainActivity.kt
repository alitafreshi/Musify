package com.tafreshiali.musify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.tafreshiali.presentation.MysSongsDestination
import com.tafreshiali.presentation.artistsScreen
import com.tafreshiali.presentation.mySongsScreen
import com.tafreshiali.presentation.navigateToArtists
import com.tafreshiali.presentation.navigateToMySongs
import com.tafreshiali.theme.MusifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusifyTheme {
                AppRoot()
            }
        }
    }
}


@Composable
private fun AppRoot() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            AppBottomBar(
                hierarchy = navController.currentBackStackEntryAsState().value?.destination?.hierarchy,
                onNavigateToMySongs = {
                    navController.navigateToMySongs()
                },
                onNavigateToArtists = {
                    navController.navigateToArtists()
                },
                onNavigateToPlaylist = {},
                onNavigateToFavorites = {}
            )
        }
    ) { paddingValues ->
        NavHost(
            modifier = Modifier.padding(paddingValues),
            navController = navController,
            startDestination = MysSongsDestination
        ) {
            mySongsScreen()
            artistsScreen()
        }
    }
}