package com.google.android.exoplayer2.myapplication.Helper

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Composable
fun snackBarExample(){
    val scaffoldState = rememberScaffoldState()
    val textFieldState = remember {
        mutableStateOf("")
    }
    val scope = rememberCoroutineScope()
    Scaffold(modifier = Modifier.fillMaxSize(), scaffoldState = scaffoldState) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {
            TextField(
                value = textFieldState.value,
                label = { Text("Enter your name") },
                onValueChange = {
                    textFieldState.value = it
                }, singleLine = true, modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                scope.launch { scaffoldState.snackbarHostState.showSnackbar("Hello ${textFieldState.value}") }
            }) {
                Text(text = "Pls greet me")
            }
        }
    }

}