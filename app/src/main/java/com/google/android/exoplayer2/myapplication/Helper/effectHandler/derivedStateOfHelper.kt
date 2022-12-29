package com.google.android.exoplayer2.myapplication.Helper.effectHandler

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import kotlinx.coroutines.delay

object derivedStateOfHelper {
    @Composable
    fun example() {
        var counter by remember {
            mutableStateOf(0)
        }
//        val counteText = "Value $counter"
        val counteText by derivedStateOf {
             "Value $counter"
        }
      Button(onClick = { counter++ }) {
            Text(text = counteText)
      }
    }
}