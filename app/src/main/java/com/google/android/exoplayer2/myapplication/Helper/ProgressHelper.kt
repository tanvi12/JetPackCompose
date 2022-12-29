package com.google.android.exoplayer2.myapplication.Helper

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object ProgressHelper {

    @Composable
    fun CircularProgressBar(
        percentage: Float,
        number: Int,
        fontSize: TextUnit = 28.sp,
        radius: Dp = 150.dp,
        color: Color = Color.Green,
        strokeWidth: Dp = 8.dp,
        animationDuration: Int = 1000,
        animDelay: Int = 0
    ) {
        var animationPlayed by remember {
            mutableStateOf(false)
        }
        val currentPercentage =
            animateFloatAsState(
                targetValue = if (animationPlayed) percentage else 0f, animationSpec = tween(
                    durationMillis = animationDuration,
                    delayMillis = animDelay
                )
            )

        LaunchedEffect(key1 = true) {
            animationPlayed = true
        }
        Box(modifier = Modifier.size(radius * 2f), contentAlignment = Alignment.Center) {
            Canvas(modifier = Modifier.size(radius * 2f)) {
                drawArc(
                    color = color,
                    startAngle = -90f,
                    sweepAngle = 360 * currentPercentage.value,
                    useCenter = false,
                    style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
                )
            }
            Text(
                text = (String.format("%.2f", currentPercentage.value)),
                color = Color.Black, fontSize = fontSize
            )
        }
    }
}