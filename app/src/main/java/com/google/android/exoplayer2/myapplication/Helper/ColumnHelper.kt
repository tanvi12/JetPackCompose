package com.google.android.exoplayer2.myapplication.Helper

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

object ColumnHelper {

    @Composable
    fun showColumns(){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(.5f),
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "tanvi")
            Text(text = "tanvi1")
        }
    }
}