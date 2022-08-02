package com.google.android.exoplayer2.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val constrains = ConstraintSet {
                val greenBox = createRefFor("greeenbox")
                val redBox = createRefFor("redbox")
                val guideline = createGuidelineFromTop(0.5f)
                constrain(greenBox) {
                    top.linkTo(guideline)
                    start.linkTo(parent.start)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)

                }
                constrain(redBox){
                    top.linkTo(parent.top)
                    start.linkTo(greenBox.end)
                    end.linkTo(parent.end)
                    width = Dimension.value(100.dp)
                    height = Dimension.value(100.dp)
                }
                createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.Packed)
            }

            ConstraintLayout(constrains, modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.layoutId("greeenbox").background(Color.Green)) {

                }
                Box(modifier = Modifier.layoutId("redbox").background(Color.Red)) {

                }
            }
        }
    }
}



