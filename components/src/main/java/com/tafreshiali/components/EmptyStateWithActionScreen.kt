package com.tafreshiali.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.tafreshiali.theme.MusifyTheme

@Composable
fun EmptyStateWithActionScreen(
    title: String,
    description: String,
    buttonText: String,
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
        },
        action = {
            Button(
                onClick = { /* Handle click */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MusifyTheme.colorScheme.primary
                ),
            ) {
                // The Icon
                Icon(
                    painter = painterResource(com.tafreshiali.theme.R.drawable.ic_add_16),
                    tint = MusifyTheme.colorScheme.onPrimary,
                    contentDescription = "Add to library", // important for accessibility
                    modifier = Modifier.size(ButtonDefaults.IconSize) // Use default icon size
                )
                // A spacer for padding between the icon and the text
                Spacer(Modifier.size(ButtonDefaults.IconSpacing)) // Use default spacing
                // The Text
                Text(
                    text = buttonText,
                    style = MusifyTheme.typography.robotoMedium14.copy(color = MusifyTheme.colorScheme.onPrimary)
                )
            }
        }
    )

}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun EmptyStateWithActionScreenPreview() {
    MusifyTheme {
        EmptyStateWithActionScreen(
            title = "No Songs Found",
            description = "You have not added any songs to your library yet.",
            buttonText = "Add Song"
        )
    }
}