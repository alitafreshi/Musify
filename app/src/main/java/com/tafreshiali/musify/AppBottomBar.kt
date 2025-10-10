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
import com.tafreshiali.theme.MusifyTheme

@Composable
fun AppBottomBar() {
    NavigationBar {
        BottomBarHomeItem()
        BottomBarSearchItem()
        BottomBarPlaylistItem()
        BottomBarProfileItem()
    }
}

@Composable
fun RowScope.BottomBarHomeItem() {
    NavigationBarItem(
        selected = true,
        onClick = { /*TODO*/ },
        icon = {
            Icon(
                painter = painterResource(id = com.tafreshiali.theme.R.drawable.ic_mymusics_24),
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
fun RowScope.BottomBarSearchItem() {
    NavigationBarItem(
        selected = false,
        onClick = { /*TODO*/ },
        icon = {
            Icon(
                painter = painterResource(id = com.tafreshiali.theme.R.drawable.ic_artist_24),
                contentDescription = "Artists BottomBar Icon"
            )
        },
        label = {
            Text(text = stringResource(R.string.bottom_bar_tv_artists_title))
        }
    )
}


@Composable
fun RowScope.BottomBarPlaylistItem() {
    NavigationBarItem(
        selected = false,
        onClick = { /*TODO*/ },
        icon = {
            Icon(
                painter = painterResource(id = com.tafreshiali.theme.R.drawable.ic_playlist_24),
                contentDescription = "Playlist BottomBar Icon"
            )
        },
        label = {
            Text(text = stringResource(R.string.bottom_bar_tv_playlist_title))
        }
    )
}


@Composable
fun RowScope.BottomBarProfileItem() {
    NavigationBarItem(
        selected = false,
        onClick = { /*TODO*/ },
        icon = {
            Icon(
                painter = painterResource(id = com.tafreshiali.theme.R.drawable.ic_favorites_24),
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
        AppBottomBar()
    }
}