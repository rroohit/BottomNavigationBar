package com.r.bottomnavigation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Color_Prime,
    primaryVariant = Color_Third,
    secondary = Color_Sec
)

private val LightColorPalette = lightColors(
    primary = Color_Prime,
    primaryVariant = Color_Third,
    secondary = Color_Sec

)

@Composable
fun BottomNavigationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}