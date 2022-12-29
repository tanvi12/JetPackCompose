package com.google.android.exoplayer2.myapplication.Helper.effectHandler

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver

object DisposableEffectHandler {
    @Composable
    fun example() {
        val lifeCycleOwner = LocalLifecycleOwner.current

        DisposableEffect(key1 = lifeCycleOwner) {
            val observer = LifecycleEventObserver { _, event ->
                if (event == Lifecycle.Event.ON_PAUSE) {

                }
            }
            lifeCycleOwner.lifecycle.addObserver(observer)
            onDispose {
                lifeCycleOwner.lifecycle.removeObserver(observer)
            }
        }

    }
}