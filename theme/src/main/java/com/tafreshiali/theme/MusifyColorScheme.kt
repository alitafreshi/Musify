package com.tafreshiali.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class MusifyColorScheme(
    val primary: Color,
    val background: Color,
    val background80: Color,
    val onBackground: Color,
    val onBackgroundVariant: Color,
    val controller: Color
)

val LocalMusifyColorScheme = staticCompositionLocalOf {
    MusifyColorScheme(
        primary = Color.Unspecified,
        background = Color.Unspecified,
        background80 = Color.Unspecified,
        onBackground = Color.Unspecified,
        onBackgroundVariant = Color.Unspecified,
        controller = Color.Unspecified
    )
}
