package com.tafreshiali.presentation

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.tafreshiali.components.EmptyStateScreen
import com.tafreshiali.favorites.presentation.R
import com.tafreshiali.theme.MusifyTheme

@Composable
internal fun FavoritesScreen() {
    EmptyStateScreen(
        title = stringResource(R.string.favorites_tv_empty_state_title),
        description = stringResource(R.string.favorites_tv_empty_state_description),
    )
}

@Preview(
    name = "Light Mode",
    showBackground = true
)
@Preview(
    name = "Dark Mode",
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
private fun FavoritesScreenPreview() {
    MusifyTheme {
        FavoritesScreen()
    }
}