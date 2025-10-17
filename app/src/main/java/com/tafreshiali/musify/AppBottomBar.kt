package com.tafreshiali.musify

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import com.tafreshiali.theme.MusifyTheme
import com.tafreshiali.theme.R.drawable

@Composable
fun AppBottomBar(
    hierarchy: Sequence<NavDestination>?,
    onNavigateToMySongs: () -> Unit,
    onNavigateToArtists: () -> Unit,
    onNavigateToPlaylist: () -> Unit,
    onNavigateToFavorites: () -> Unit
) {
    NavigationBar {
        BottomBarMySongsItem(onNavigateToMySongs)
        BottomBarArtistsItem(onNavigateToArtists)
        BottomBarPlaylistItem(onNavigateToPlaylist)
        BottomBarFavoritesItem(onNavigateToFavorites)
    }
}

@Composable
fun RowScope.BottomBarMySongsItem(onNavigateToMySongs: () -> Unit) {
    NavigationBarItem(
        selected = true,
        onClick = onNavigateToMySongs,
        icon = {
            Icon(
                painter = painterResource(id = drawable.ic_mymusics_24),
                contentDescription = "My Songs BottomBar Icon"
            )
        },
        label = {
            Text(
                text = stringResource(R.string.bottom_bar_tv_my_songs_title),
                color = MusifyTheme.colorScheme.primary,
                style = MusifyTheme.typography.robotoMedium11
            )
        }
    )
}

@Composable
fun RowScope.BottomBarArtistsItem(onNavigateToArtists: () -> Unit) {
    NavigationBarItem(
        selected = false,
        onClick = onNavigateToArtists,
        icon = {
            Icon(
                painter = painterResource(id = drawable.ic_artist_24),
                contentDescription = "Artists BottomBar Icon"
            )
        },
        label = {
            Text(text = stringResource(R.string.bottom_bar_tv_artists_title))
        }
    )
}


@Composable
fun RowScope.BottomBarPlaylistItem(onNavigateToPlaylist: () -> Unit) {
    NavigationBarItem(
        selected = false,
        onClick = onNavigateToPlaylist,
        icon = {
            Icon(
                painter = painterResource(id = drawable.ic_playlist_24),
                contentDescription = "Playlist BottomBar Icon"
            )
        },
        label = {
            Text(text = stringResource(R.string.bottom_bar_tv_playlist_title))
        }
    )
}


@Composable
fun RowScope.BottomBarFavoritesItem(onNavigateToFavorites: () -> Unit) {
    NavigationBarItem(
        selected = false,
        onClick = onNavigateToFavorites,
        icon = {
            Icon(
                painter = painterResource(id = drawable.ic_favorites_24),
                contentDescription = "Favorites BottomBar Icon"
            )
        },
        label = {
            Text(text = stringResource(R.string.bottom_bar_tv_favorites_title))
        }
    )
}


@Preview
@Composable
fun AppBottomBarPreview() {
    MusifyTheme {
        AppBottomBar(
            hierarchy = null,
            onNavigateToMySongs = {},
            onNavigateToArtists = {},
            onNavigateToPlaylist = {},
            onNavigateToFavorites = {}
        )
    }
}