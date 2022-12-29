package com.google.android.exoplayer2.myapplication.Helper.effectHandler

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import kotlinx.coroutines.delay

object ProduceStateHelper {
    @Composable
    fun example(countUpTo: Int): State<Int> {
        return produceState(initialValue = 0) {
            while (value < countUpTo) {
                delay(1000L)
                value++
            }
        }
    }
}