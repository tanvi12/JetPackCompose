
package com.google.android.exoplayer2.myapplication.Helper.effectHandler

import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object RememberCoroutineScope {
    @Composable
    fun example() {
      val scope = rememberCoroutineScope()
        Button(onClick = {
            scope.launch {
                delay(1000L)
                println("Hello World!")
            }
        }) {

        }

    }
}