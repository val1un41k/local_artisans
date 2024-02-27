package com.example.learning1.app.components


import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox

import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learning1.R
import com.example.learning1.ui.theme.BgColor
import com.example.learning1.ui.theme.ComponentsShapes
import com.example.learning1.ui.theme.Primary
import com.example.learning1.ui.theme.Secondary


@Composable
fun NormalTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
    )
        , color = colorResource(id = R.color.ColorText),
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        )
        , color = colorResource(id = R.color.ColorText),
        textAlign = TextAlign.Center
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldComponent(labelValue: String){
    val textValue = remember {
        mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(ComponentsShapes.small),
        label = {Text(text = labelValue)},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = BgColor,
            focusedBorderColor = colorResource(id = R.color.Primary),
            focusedLabelColor = Primary,
            cursorColor = Primary,
        ),
        keyboardOptions = KeyboardOptions.Default,
        value = textValue.value,
        onValueChange = {
                        textValue.value = it
        },
        leadingIcon = {
          Icons.Filled.AccountBox
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextFieldComponent(labelValue: String){
    val password = remember {
        mutableStateOf("") }
    val passwordVisible = remember {
        mutableStateOf(false) }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(ComponentsShapes.small),
        label = {Text(text = labelValue)},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = BgColor,
            focusedBorderColor = colorResource(id = R.color.Primary),
            focusedLabelColor = Primary,
            cursorColor = Primary,
        ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        value = password.value,
        onValueChange = {
            password.value = it
        },

        trailingIcon = {
            val iconImage = if (passwordVisible.value) {
                Icons.Filled.Close
            } else {
                Icons.Filled.Face
            }

            val description = if (passwordVisible.value) {
                "Hide Password"
            } else {
                "Show Password"
            }
            IconButton(onClick = {passwordVisible.value = !passwordVisible.value}) {
                Icon(imageVector = iconImage, description)
            }
        },
        visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation()
    )
}

@Composable
fun CheckBoxComponent(value: String){
    //same parameter as the clickable text
    //, onTextSelected: (String) -> Unit
    Row(modifier = Modifier
        .fillMaxWidth()
        .heightIn(56.dp),
        verticalAlignment = Alignment.CenterVertically){
        val checkedState = remember{
            mutableStateOf(false)
        }
        Checkbox(checked = checkedState.value,
            onCheckedChange = { checkedState.value != checkedState.value })
       // NormalTextComponent(value = stringResource(id =R.string.terms_and_conditions))

        ClickableTextComponent(value = value)
    }

}

@Composable
fun ClickableTextComponent(value: String){
    //Add in contitions for the function (, onTextSelected: (String) -> Unit)
    val innitialText = "By continuing, you agree to our "
    val privacyPolicy = "Privacy Policy"
    val andText = "and"
    val termsAndConditions = "Terms of Service"

    val annotatedString = buildAnnotatedString {
        append(innitialText)
        withStyle(style = SpanStyle(color = colorResource(id = R.color.Primary))){
            pushStringAnnotation(tag = "Privacy Policy", annotation = privacyPolicy)
            append(privacyPolicy)
        }
        append(andText)
        withStyle(style = SpanStyle(color = colorResource(id = R.color.Primary))){
            pushStringAnnotation(tag = "Terms of Service", annotation = termsAndConditions)
            append(termsAndConditions)
        }
    }
    ClickableText(text = annotatedString, onClick = {offset ->
    //which part of the text was clicked
      annotatedString.getStringAnnotations(offset,offset).firstOrNull()?.also { span ->
          Log.d("ClickableTextComponent", "{$span")
          /*if span.tag == termsAndConditionsText){
          onTextSelected(spen.item)
        }

           */
      }

    })
}

@Composable
fun ButtonComponent(value: String){
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp),
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(Color.Transparent)

    ){
        Box(modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp).background(
                brush = Brush.horizontalGradient(listOf(Secondary, Primary)),
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