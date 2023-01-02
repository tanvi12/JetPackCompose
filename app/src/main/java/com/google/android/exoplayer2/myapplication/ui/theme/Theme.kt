package com.google.android.exoplayer2.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun MeditationUIYouTubeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {

    // Adding spacing so we can access from anywhere in compose function
    // this is how we can access
   // LocalSpacing.current.small
    CompositionLocalProvider(LocalSpacing.provides(Spacing()) ) {
        MaterialTheme(
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }

}