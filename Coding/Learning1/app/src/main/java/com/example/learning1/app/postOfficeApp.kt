package com.example.learning1.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.learning1.screens.SignUpScreen


@Composable
fun PostOfficeApp(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White

    ){
        /*Crossfade(targetState = AppRouter.currentScreen){currentState->
        when(currentState.value){
        is Screen.SignUpScreen ->{
        SignUpScreen()
        }
        is Screen.TermsAndConditionsScreen ->{
        TermsAndConditionsScreen()
        }
        }
        }
         */
        SignUpScreen()
    }
}