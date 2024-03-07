package com.example.artisans_app.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


import com.example.artisans_app.app.components.HeadingTextComponentWithoutLogout
import com.example.artisans_app.ui.theme.ColorSecndary
import com.example.artisans_app.ui.theme.Primary



@Composable
fun HomeScreen(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
            .padding(28.dp),
    )
    {
        HeadingTextComponentWithoutLogout(value = "Application Home Screen")
        Column(modifier = Modifier
            .fillMaxSize(),
            Arrangement.Center
        ) {
            Spacer(modifier = Modifier.height(80.dp))
            //TODO Add Component Customer User
            ButtonCustomerUser(value = "Customer User", navController)
        Spacer (modifier = Modifier.height(120.dp))
            //TODO Add Component Craft Maket User
            ButtonCraftMakerUser(value = "Craft Maker User", navController)

        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
  //  HomeScreen(navController)
}

@Composable
fun ButtonCustomerUser(value: String, navController: NavHostController){
    Button(
        onClick = { /*TODO*/
                  navController.navigate("loginScreenForCustomer")},
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp),
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(Color.Transparent)

    ){
        Box(modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp).background(
                brush = Brush.horizontalGradient(listOf(ColorSecndary, Primary)),
                RoundedCornerShape(50.dp)
            ),
            contentAlignment = Alignment.Center
        ){
            Text(text = value,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun ButtonCraftMakerUser(value: String, navController: NavHostController){
    Button(
        onClick = { /*TODO*/
                  navController.navigate("ArtisanLoginScreen")},
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp),
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(Color.Transparent)

    ){
        Box(modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp).background(
                brush = Brush.horizontalGradient(listOf(ColorSecndary, Primary)),
                RoundedCornerShape(50.dp)
            ),
            contentAlignment = Alignment.Center
        ){
            Text(text = value,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold)
        }
    }
}

