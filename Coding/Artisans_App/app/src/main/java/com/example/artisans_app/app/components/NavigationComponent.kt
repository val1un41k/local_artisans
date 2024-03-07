package com.example.artisans_app.app.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.artisans_app.screens.ArtisanLoginScreen
import com.example.artisans_app.screens.ArtisansHomeScreen
import com.example.artisans_app.screens.CustomerHomeDashboardScreen
import com.example.artisans_app.screens.HomeScreen
import com.example.artisans_app.screens.loginScreenForCustomer

@Composable
fun navigationHomeScreen (){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "HomeScreen"){
        composable(route = "HomeScreen"){
            HomeScreen(navController)
        }


        composable(route = "ArtisanLoginScreen"){
            ArtisanLoginScreen(navController)
        }

        composable(route = "loginScreenForCustomer"){
            loginScreenForCustomer(navController)

        }

    }
}

@Composable
fun loginArtisanNavigation (){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "")
    {
        composable(route = "ArtisansHomeScreen"){
            ArtisansHomeScreen(navController)
        }
    }

}
@Composable
fun loginCustomerNavigation (){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "")
    {
        composable(route = "CustomerHomeDashboardScreen"){
            CustomerHomeDashboardScreen(navController)
        }
    }
}

@Composable
fun navigationCustomer (){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "")
    {
        composable(route = "loginScreenForCustomer"){
            loginScreenForCustomer(navController)
        }
    }
}