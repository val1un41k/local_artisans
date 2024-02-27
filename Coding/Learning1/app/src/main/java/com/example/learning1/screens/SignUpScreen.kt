package com.example.learning1.screens

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learning1.R
import com.example.learning1.app.components.ButtonComponent
import com.example.learning1.app.components.CheckBoxComponent
import com.example.learning1.app.components.HeadingTextComponent
import com.example.learning1.app.components.MyTextFieldComponent
import com.example.learning1.app.components.NormalTextComponent
import com.example.learning1.app.components.PasswordTextFieldComponent

@Composable
fun SignUpScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp),

        )
    {
        Column(modifier = Modifier.fillMaxSize()) {

// NormalTextComponent(value = "Sign Up Screen")
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(labelValue = stringResource(id = R.string.first_name))
            MyTextFieldComponent(labelValue = stringResource(id = R.string.last_name))
            MyTextFieldComponent(labelValue = stringResource(id = R.string.email))
            PasswordTextFieldComponent(labelValue = stringResource(id = R.string.password))
            CheckBoxComponent(value= stringResource(id = R.string.terms_and_conditions))

         Spacer(modifier = Modifier.height(40.dp))

        ButtonComponent(value = "Register")
        }
    }
}

@Preview
@Composable
fun PreviewSignUpScreen() {
    SignUpScreen()
}
