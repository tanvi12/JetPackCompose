package com.google.android.exoplayer2.myapplication.Helper.effectHandler

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import kotlinx.coroutines.delay

object LaunchedEffectHelper {
    @Composable
    fun example() {
        val text by remember {
            mutableStateOf("")
        }
        LaunchedEffect(key1 = true)
        {
            delay(1000L)
            println("The text is $text")
        }

    }
}