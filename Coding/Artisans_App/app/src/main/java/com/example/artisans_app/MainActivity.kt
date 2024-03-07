package com.example.artisans_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.artisans_app.screens.HomeScreen
import androidx.navigation.NavHostController
import com.example.artisans_app.app.components.navigationHomeScreen
import com.example.artisans_app.app.localArtisan

class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            localArtisan()
        }
    }
}
