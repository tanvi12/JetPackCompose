package com.google.android.exoplayer2.myapplication.Helper

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

object AnimationHelper {
    @Composable
    fun showAnimation() {
        var sizeState by remember {
            mutableStateOf(200.dp)
        }
        val infiniteTrasation = rememberInfiniteTransition()
        val color by infiniteTrasation.animateColor(
            initialValue = Color.Red,
            targetValue = Color.Green,
            animationSpec = infiniteRepeatable(
                tween(durationMillis = 2000),
                repeatMode = RepeatMode.Reverse
            )
        )
        val size by animateDpAsState(
            targetValue = sizeState,
//            animationSpec = tween(durationMillis = 3000, delayMillis = 300, easing = LinearOutSlowInEasing)

//            spring(Spring.DampingRatioHighBouncy)

            // low level animation
//        keyframes {
//            durationMillis = 5000
//            sizeState at 0 with LinearEasing
//            sizeState * 1.5f at 1000 with FastOutLinearInEasing
//            sizeState * 2f at 5000
//        }

        )
        Box(
            modifier = Modifier
                .size(size)
                .background(color),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = { sizeState += 50.dp }) {
                Text(text = "Increase Size")
            }

        }
    }
}