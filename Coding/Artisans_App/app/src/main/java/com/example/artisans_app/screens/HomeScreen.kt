package com.example.artisans_app.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artisans_app.app.components.ButtonComponent

import com.example.artisans_app.app.components.HeadingTextComponentWithoutLogout


@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
            .padding(28.dp),
    )
    {
        HeadingTextComponentWithoutLogout(value = "Application Home Screen")
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(80.dp))

            Spacer(modifier = Modifier.height(80.dp))
            //TODO Add Component Customer User
            ButtonComponent(value = "Customer User")
        Spacer (modifier = Modifier.height(60.dp))
            //TODO Add Component Craft Maket User
        ButtonComponent(value = "Craft Maker User")

        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}

