package com.google.android.exoplayer2.myapplication.image

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier

object ImageHelper {

    @Composable
    fun ImageCard(modifier: Modifier = Modifier, title: String, description: String, painter: Painter) {
        Card( shape = RoundedCornerShape(15.dp), elevation = 5.dp, modifier = Modifier.padding(15.dp)) {
            Box(modifier = modifier
                .height(200.dp)
                .fillMaxWidth(fraction = 0.5f)) {
                Image(
                    painter = painter,
                    contentDescription = description,
                    contentScale = ContentScale.Crop
                )
                Box( modifier = Modifier.fillMaxSize().background(brush = Brush.verticalGradient(startY = 350f, colors = listOf(Color.Transparent,Color.Black)))){

                }
                Box(contentAlignment = Alignment.BottomStart, modifier = Modifier.fillMaxSize()){
                    Text(text = title, style = TextStyle(color = Color.White), modifier = Modifier.padding(12.dp))
                }

            }
        }
    }

}