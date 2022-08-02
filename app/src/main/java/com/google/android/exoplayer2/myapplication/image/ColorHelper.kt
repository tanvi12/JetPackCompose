package com.google.android.exoplayer2.myapplication.image

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

@Composable
fun ColorBox(modifier: Modifier = Modifier, updateColor: (Color) -> Unit) {

    Box(modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor(Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 1f))
        })
}

@Composable
fun stateExample(){
    Column {
        val color = remember {
            mutableStateOf(Color.Yellow)
        }
        ColorBox(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            color.value = it
        }
        Box(
            modifier = Modifier
                .background(color.value)
                .fillMaxSize()
                .weight(1f)
        )
    }
}