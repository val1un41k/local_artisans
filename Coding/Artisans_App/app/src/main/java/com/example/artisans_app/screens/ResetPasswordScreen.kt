package com.example.artisans_app.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import com.example.artisans_app.app.components.myTextFireldContent


@Composable
fun ResetPasswordScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
            .padding(28.dp),
    ){
        HeadingTextComponentWithoutLogout(value = "Reset Password Screen")
    Column(Modifier.fillMaxSize(),
        Arrangement.Center){
        //TODO Add Component Email and address per registration
        myTextFireldContent(labelValue = "Email and address per registration")
        Spacer(modifier = Modifier.height(80.dp))

        //TODO Add Component Reset Password Button
        ButtonComponent(value = "Reset Password")
    }
    }
}

@Preview
@Composable
fun PreviewResetPasswordScreen() {
    ResetPasswordScreen()
}