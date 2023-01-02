package com.google.android.exoplayer2.myapplication.LazyGrid

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyGridExample(){
    val state = rememberLazyListState(
        initialFirstVisibleItemIndex = 99
    )
    LazyVerticalGrid(
        cells = GridCells.Fixed(5),
        state = state,
        content = {
            items(100) { i ->
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .aspectRatio(1f)
                        .clip(RoundedCornerShape(5.dp))
                        .background(Color.Green),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Item $i")
                }
            }
        }
    )
}

fun items(i: Int, any: Any) {

}
