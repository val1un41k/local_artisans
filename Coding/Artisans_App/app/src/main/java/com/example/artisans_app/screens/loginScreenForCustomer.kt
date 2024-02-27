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
import com.example.artisans_app.app.components.HeadingTextComponentWithoutLogout
import com.example.artisans_app.app.components.PasswordTextFieldComponent
import com.example.artisans_app.app.components.myTextFireldContent

@Composable
fun loginScreenForCustomer() {
    Surface(
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
            .padding(28.dp),
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
        HeadingTextComponentWithoutLogout(value = "Login Screen For Customer")

        Spacer(modifier = Modifier.height(40.dp))


            myTextFireldContent(labelValue = "User Name")
            PasswordTextFieldComponent(labelValue = "Password")
            //TODO chenge the TextField to Varify Password Text Field
            PasswordTextFieldComponent(labelValue = "Confirm Password")
            Spacer(modifier = Modifier.height(40.dp))

            //TODO change to CustomerLoginButton Component
            ButtonComponent(value = "Login")
            Spacer(modifier = Modifier.height(40.dp))
           // ClickableTextComponent(value = "First time user?")
        }
    }
}

@Preview
@Composable
fun PreviewloginScreenForCustomer() {
    loginScreenForCustomer()
}