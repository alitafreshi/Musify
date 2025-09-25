package com.tafreshiali.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

private val LightColorScheme = MusifyColorScheme(
    primary = LightPrimary,
    background = LightBackground,
    background80 = LightBackground80,
    onBackground =LightOnBackground,
    onBackgroundVariant = LightOnBackgroundVariant,
    controller = LightController
)


private val DarkColorScheme = MusifyColorScheme(
    primary = DarkPrimary,
    background = DarkBackground,
    background80 = DarkBackground80,
    onBackground = DarkOnBackground,
    onBackgroundVariant = DarkOnBackgroundVariant,
    controller = DarkController
)

/*@Composable
fun MusifyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    CompositionLocalProvider(
        LocalMusifyColorScheme provides colorScheme,
        content = content
    )
}*/
