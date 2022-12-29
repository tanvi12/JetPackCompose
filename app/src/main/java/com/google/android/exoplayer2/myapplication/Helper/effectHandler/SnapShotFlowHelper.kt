package com.google.android.exoplayer2.myapplication.Helper.effectHandler

import androidx.compose.material.Button
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.mapNotNull

object SnapShotFlowHelper {
    @Composable
    fun example() {
       val scaffoldState = rememberScaffoldState()
        LaunchedEffect(key1 = scaffoldState){
            snapshotFlow { scaffoldState.snackbarHostState }
                .mapNotNull { it.currentSnackbarData?.message }
                .distinctUntilChanged()
                .collect {
                    println("A snackbar with message $it")
                }
        }
    }
}