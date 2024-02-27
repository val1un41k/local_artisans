package com.example.artisans_app.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artisans_app.R
import com.example.artisans_app.app.components.ButtonComponent
import com.example.artisans_app.app.components.HeadingTextComponentWithLogOut
import com.example.artisans_app.app.components.myTextFireldContent

@Composable
fun UpdateArtisansPersonalDetails() {
    Surface(
        Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            HeadingTextComponentWithLogOut(value = "Update Artisan's Personal / Business Details")

            myTextFireldContent(labelValue = "Artisan's Name")
            myTextFireldContent(labelValue = "Artisan's Surname")
            Spacer(modifier = Modifier.height(5.dp))
            ButtonComponent(value = "Update")
            Spacer(modifier = Modifier.height(5.dp))

            myTextFireldContent(labelValue = "Artisan mobile number")
            Spacer(modifier = Modifier.height(5.dp))
            ButtonComponent(value = "Update")
            Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Artisan Photo",
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(),
                    style = TextStyle(
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Normal
                    ),
                    color = colorResource(id = R.color.black),
                    textAlign = TextAlign.Center
                )

                ButtonComponent(value = "Upload")
            Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Business Venue Address",
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(),
                    style = TextStyle(
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Normal
                    ),
                    color = colorResource(id = R.color.black),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(5.dp))
                myTextFireldContent(labelValue = "Street Address")
                Spacer(modifier = Modifier.height(5.dp))
                myTextFireldContent(labelValue = "Logitude")
                Spacer(modifier = Modifier.height(5.dp))
                myTextFireldContent(labelValue = "Latitude")
                Spacer(modifier = Modifier.height(5.dp))
                ButtonComponent(value = "Update")


                Spacer(modifier = Modifier.height(5.dp))
                //TODO Create Component ArtisanUpdateCancelButton
                ButtonComponent(value = "Cancel")



            
        }
    }
}

@Preview
@Composable
fun UpdateArtisansPersonalDetailsPreview() {
    UpdateArtisansPersonalDetails()
}