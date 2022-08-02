package com.google.android.exoplayer2.myapplication.image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.google.android.exoplayer2.myapplication.R

object TextHelper {

    @Composable
    fun applyFont( fontWeight: FontWeight){
        val fontFamily = FontFamily(
            Font(R.font.roboto_bold, FontWeight.Bold),
            Font(R.font.roboto_regular, FontWeight.Normal),
            Font(R.font.roboto_light, FontWeight.Light),
            Font(R.font.roboto_medium, FontWeight.Medium),
            Font(R.font.roboto_condensed_light, FontWeight.ExtraLight)
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF101010))
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Green,
                            fontSize = 50.sp

                        )
                    ){
                        append("J")
                    }
                    append("etpack Compose")

                },
                color = Color.White,
                fontSize = 30.sp,
                fontFamily = fontFamily,
                fontWeight = fontWeight,
                textDecoration = TextDecoration.Underline
            )
        }
    }
}