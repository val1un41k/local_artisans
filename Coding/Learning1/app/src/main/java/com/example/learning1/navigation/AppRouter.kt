package com.example.learning1.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen(){
  //  Object SignUpScreen: Screen()
}

/*Object AppRouter{
    val currentScreen: MutableState<Screen> = mutableStateOf(Screen.SignUpScreen)
    fun navigateTo(destinationScreen: Screen){
        currentScreen.value = destinationScreen
    }
}

 */