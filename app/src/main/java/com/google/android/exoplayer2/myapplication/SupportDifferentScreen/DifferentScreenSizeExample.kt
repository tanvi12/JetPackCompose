package com.google.android.exoplayer2.myapplication.SupportDifferentScreen

import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun showListDifferentScreenSizeExample() {
    val windowInfo = rememberWindowInfo()
    if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            // List 1
            items(10) {
                Text(
                    text = "Item $it",
                    fontSize = 25.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Cyan)
                        .padding(16.dp)
                )
            }
            // List 2
            items(10) {
                Text(
                    text = "Item $it",
                    fontSize = 25.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Green)
                        .padding(16.dp)
                )
            }
        }
    } else {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            LazyColumn(
                modifier = Modifier.weight(1f)
            ) {
                // List 1
                items(10) {
                    Text(
                        text = "Item $it",
                        fontSize = 25.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Green)
                            .padding(16.dp)
                    )
                }
            }
            LazyColumn(
                modifier = Modifier.weight(1f)
            ) {
                // List 1
                items(10) {
                    Text(
                        text = "Item $it",
                        fontSize = 25.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Cyan)
                            .padding(16.dp)
                    )
                }
            }
        }

    }
}