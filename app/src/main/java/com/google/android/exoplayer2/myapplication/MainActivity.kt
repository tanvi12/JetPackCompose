package com.google.android.exoplayer2.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.android.exoplayer2.myapplication.MeditationUI.HomeScreen
import com.google.android.exoplayer2.myapplication.ui.theme.MeditationUIYouTubeTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MeditationUIYouTubeTheme {
                HomeScreen()
            }

        }
    }

}



