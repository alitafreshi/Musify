package com.tafreshiali.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily

val Roboto = FontFamily(
    Font(R.font.roboto_thin),
    Font(R.font.roboto_light),
    Font(R.font.roboto_regular),
    Font(R.font.roboto_medium),
    Font(R.font.roboto_bold),
    Font(R.font.roboto_semibold),
    Font(R.font.roboto_black)
)

val Arima = FontFamily(
    Font(R.font.arima_regular),
    Font(R.font.arima_medium),
    Font(R.font.arima_bold),
)

data class MusifyTypography(
    val robotoLight9: TextStyle,
    val robotoRegular11: TextStyle,
    val robotoRegular12: TextStyle,
    val robotoRegular13: TextStyle,
    val robotoRegular14: TextStyle,
    val robotoRegular15: TextStyle,
    val robotoRegular16: TextStyle,
    val robotoMedium11: TextStyle,
    val robotoMedium13: TextStyle,
    val robotoMedium14: TextStyle,
    val robotoMedium15: TextStyle,
    val robotoMedium16: TextStyle,
    val robotoMedium20: TextStyle,
    val arimaBold32: TextStyle,
)

val LocalMusifyTypography = staticCompositionLocalOf {
    MusifyTypography(
        robotoLight9 = TextStyle.Default,
        robotoRegular11 = TextStyle.Default,
        robotoRegular12 = TextStyle.Default,
        robotoRegular13 = TextStyle.Default,
        robotoRegular14 = TextStyle.Default,
        robotoRegular15 = TextStyle.Default,
        robotoRegular16 = TextStyle.Default,
        robotoMedium11 = TextStyle.Default,
        robotoMedium13 = TextStyle.Default,
        robotoMedium14 = TextStyle.Default,
        robotoMedium15 = TextStyle.Default,
        robotoMedium16 = TextStyle.Default,
        robotoMedium20 = TextStyle.Default,
        arimaBold32 = TextStyle.Default,
    )
}