package com.cossyyy.myapplication.ui.theme.screens.product

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.cossyyy.myapplication.navigation.ROUTE_ADD_PRODUCT
import com.cossyyy.myapplication.navigation.ROUTE_CATEGORY
import com.cossyyy.myapplication.navigation.ROUTE_LOGIN

@Composable
fun Saleproductscreen(navController: NavHostController) {
    var number by remember { mutableStateOf(TextFieldValue("")) }
    var card by remember { mutableStateOf(TextFieldValue("")) }


    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center){
        Text(
            text = "Select mode of Payment" ,
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif)

        OutlinedTextField(
            value = number, onValueChange = { var number = it },
            label = { Text(text = "Enter number") },

            keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),

            )

        OutlinedTextField(value =number, onValueChange = {number=it},
            label = { Text(text = "Enter card number") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp))
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ROUTE_CATEGORY)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Confirm Payment")
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ROUTE_ADD_PRODUCT)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Add Product")
        }

    }
    
}

@Preview
@Composable
private fun Saleproductpre() {
    Saleproductscreen(rememberNavController())
    
}
