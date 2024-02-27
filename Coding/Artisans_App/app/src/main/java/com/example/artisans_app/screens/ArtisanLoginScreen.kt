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
import com.example.artisans_app.app.components.ClickableTextComponent
import com.example.artisans_app.app.components.ClickableTextResetPasswordArtisan
import com.example.artisans_app.app.components.HeadingTextComponentWithoutLogout
import com.example.artisans_app.app.components.PasswordTextFieldComponent
import com.example.artisans_app.app.components.myTextFireldContent

@Composable
fun ArtisanLoginScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp),
    )
    {
        Column(
            modifier = Modifier.fillMaxSize()
        )
        {
            HeadingTextComponentWithoutLogout(value = "Artisan Login Screen")
            Spacer(modifier = Modifier.height(40.dp))
            //TODO Create Component ArtisanEmailTextField
            myTextFireldContent(labelValue = "User Name (email)")
            Spacer(modifier = Modifier.height(40.dp))
            PasswordTextFieldComponent(labelValue = "Password")
            Spacer(modifier = Modifier.height(40.dp))

            //TODO Create Component ArtisanLoginButton
            ButtonComponent(value = "Login")
            Spacer(modifier = Modifier.height(40.dp))

            //TODO Create Component TextResetPasswordArtisan
           // ClickableTextResetPasswordArtisan(value = "Forgot Your Password?", route = "ArtisanResetPasswordScreen")
        }


        }
    }

@Preview
@Composable
fun PreviewArtisanLoginScreen() {
    ArtisanLoginScreen()
}