package com.google.android.exoplayer2.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.res.painterResource
import com.google.android.exoplayer2.myapplication.image.ImageHelper.ImageCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val title = "Kermit playing in snow"
            val description = "Kermit playing in snow"
            val painter = painterResource(id = R.drawable.kermit)
            ImageCard(title = title, description = description, painter = painter)

        }
    }
}

