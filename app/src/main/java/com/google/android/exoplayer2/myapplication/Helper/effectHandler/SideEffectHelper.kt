package com.google.android.exoplayer2.myapplication.Helper.effectHandler

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import kotlinx.coroutines.delay

object SideEffectHelper {
    @Composable
    fun example(nonComposeCounter : Int) {
       SideEffect {
           println("Called after every recompositon")
       }

    }
}