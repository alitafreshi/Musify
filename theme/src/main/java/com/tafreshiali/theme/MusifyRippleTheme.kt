package com.tafreshiali.theme

import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object MusifyRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor(): Color = MusifyTheme.colors.primary

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleTheme.defaultRippleAlpha(
        contentColor = MusifyTheme.colors.primary,
        lightTheme = !MusifyTheme.colors.isDark
    )
}
