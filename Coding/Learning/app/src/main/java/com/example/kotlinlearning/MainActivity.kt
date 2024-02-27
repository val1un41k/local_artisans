package com.example.kotlinlearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Android")
        }
    }
}

 The  setContent  function is used to set the content of the activity. It takes a composable function as a parameter.
 The  Greeting  composable function is defined in the  Greeting.kt  file.
 // Path: app/src/main/java/com/example/kotlinlearning/Greeting.kt
