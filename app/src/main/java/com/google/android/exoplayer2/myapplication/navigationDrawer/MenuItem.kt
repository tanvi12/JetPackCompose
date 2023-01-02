package com.google.android.exoplayer2.myapplication.navigationDrawer

import androidx.compose.ui.graphics.vector.ImageVector

data class MenuItem(
    val id: String,
    val title: String,
    val contentDescription: String,
    val icon: ImageVector
)