package com.tafreshiali.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val LightColorScheme = MusifyColorScheme(
    primary = LightPrimary,
    background = LightBackground,
    background80 = LightBackground80,
    onBackground = LightOnBackground,
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

private val typography: MusifyTypography = MusifyTypography(
    robotoLight9 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Light,
        fontSize = 9.sp,
    ),
    robotoRegular11 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp,
    ),
    robotoRegular12 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        fontFamily = Roboto,
    ),
    robotoRegular13 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
        fontFamily = Roboto,
    ),
    robotoRegular14 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        fontFamily = Roboto,
    ),
    robotoRegular15 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        fontFamily = Roboto,
    ),
    robotoRegular16 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        fontFamily = Roboto,
    ),
    robotoMedium11 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
    ),
    robotoMedium13 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
    ),
    robotoMedium14 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
    ),
    robotoMedium15 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
    ),
    robotoMedium16 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
    ),
    robotoMedium20 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
    ),
    arimaBold32 = TextStyle(
        fontFamily = Arima,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
    )
)

@Composable
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
        LocalMusifyTypography provides typography,
        content = content
    )
}
