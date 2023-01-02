package com.google.android.exoplayer2.myapplication.Navigation

sealed class Screen(val route:String){
    object MainScreen : Screen("main_screen")
    object DetailScreen : Screen("detail_screen")

    fun withArgs(vararg  args :String) : String{
        return buildString {
            append(route)
            args.forEach { it ->
                append("/$it")
            }
        }
    }
}