package com.google.android.exoplayer2.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.google.android.exoplayer2.myapplication.MeditationUI.HomeScreen
import com.google.android.exoplayer2.myapplication.Timer.Timer
import com.google.android.exoplayer2.myapplication.ui.theme.MeditationUIYouTubeTheme
import androidx.compose.material.Text
import com.google.android.exoplayer2.myapplication.BottomNavigation.BottomNavigationShow
import com.google.android.exoplayer2.myapplication.BottomSheet.showBottomSheet
import com.google.android.exoplayer2.myapplication.DropDown.DropDown
import com.google.android.exoplayer2.myapplication.Instagram.ProfileScreen
import com.google.android.exoplayer2.myapplication.MutliSelection.MultiSelection
import com.google.android.exoplayer2.myapplication.Navigation.Navigation
import com.google.android.exoplayer2.myapplication.Pagination.showPaginationExample
import com.google.android.exoplayer2.myapplication.ParallaxScrollEffect.ParallaxScrollEffect
import com.google.android.exoplayer2.myapplication.Permission.PermissionExample
import com.google.android.exoplayer2.myapplication.Splash.SplashNavigation
import com.google.android.exoplayer2.myapplication.SupportDifferentScreen.showListDifferentScreenSizeExample
import com.google.android.exoplayer2.myapplication.navigationDrawer.navigationDrawerExample

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            navigationDrawerExample()
            //showBottomSheet()
//            showPaginationExample()
//            showListDifferentScreenSizeExample()
//            Navigation()
//            MeditationUIYouTubeTheme {
//                HomeScreen()
//            }

//            Surface(color = Color(0xFF101010), modifier = Modifier.fillMaxSize()) {
//                Box(contentAlignment = Alignment.Center){
//                    Timer(
//                        totalTime = 100L * 1000L,
//                        handleColor = Color.Green,
//                        inactiveColor = Color.DarkGray,
//                        activeColor = Color(0xFF37B900),
//                        modifier = Modifier.size(200.dp)
//                    )
//                }
//            }

//            Surface(
//                color = Color(0xFF101010),
//                modifier = Modifier.fillMaxSize()
//            ) {
//                DropDown(
//                    text = "Hello World!",
//                    modifier = Modifier.padding(15.dp)
//                ) {
//                    Text(
//                        text = "This is now revealed!", modifier = Modifier
//                            .fillMaxWidth()
//                            .height(100.dp)
//                            .background(Color.Green)
//                    )
//                }
//            }

//            ProfileScreen()

//            BottomNavigationShow()
            //  ParallaxScrollEffect()

//            MultiSelection()

       //     PermissionExample()
        }

    }

}



