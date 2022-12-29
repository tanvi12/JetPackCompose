package com.google.android.exoplayer2.myapplication.Helper.effectHandler

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import kotlinx.coroutines.delay

object RememberUpdateStateDemo {
    @Composable
    fun example(onTimeout: () -> Unit) {

        val updatedOnTimeout by rememberUpdatedState(newValue = onTimeout)
        LaunchedEffect(
            key1 = true
        ) {
            delay(3000L)
            updatedOnTimeout()
        }
    }
}