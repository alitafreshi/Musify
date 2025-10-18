package com.tafreshiali.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.tafreshiali.theme.MusifyTheme

@Composable
fun EmptyStateScreen(
    title: String,
    description: String
) {
    BaseEmptyStateScreen(
        title = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = title,
                style = MusifyTheme.typography.robotoMedium15.copy(
                    color = MusifyTheme.colorScheme.onBackground,
                    textAlign = TextAlign.Center
                )
            )
        },
        description = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = description,
                style = MusifyTheme.typography.robotoRegular12.copy(
                    color = MusifyTheme.colorScheme.onBackgroundVariant,
                    textAlign = TextAlign.Center
                )
            )
        }
    )
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES )
@Composable
private fun EmptyStateScreenPreview() {
    MusifyTheme {
        EmptyStateScreen(title = "No Songs", description ="No Songs added to this playlist yet")
    }
}