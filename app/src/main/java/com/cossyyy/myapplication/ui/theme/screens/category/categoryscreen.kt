package com.cossyyy.myapplication.ui.theme.screens.category

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.cossyyy.myapplication.navigation.ROUTE_FRUIT_CART
import com.cossyyy.myapplication.navigation.ROUTE_JUICE_CART
import com.cossyyy.myapplication.navigation.ROUTE_SHOES_CART
import com.cossyyy.myapplication.navigation.ROUTE_VEGETABLE_CART

@Composable
fun Categoryscreen(navController: NavHostController) {
    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ){
        Text(
            text = "Category",
            modifier = Modifier.padding(16.dp),
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            color = Color.Blue


        )

        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {
            navController.navigate(ROUTE_FRUIT_CART)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Fruits")
        }
        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {
            navController.navigate(ROUTE_JUICE_CART)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Juice")
        }
        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {
            navController.navigate(ROUTE_VEGETABLE_CART)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Vegetables")
        }
        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {
            navController.navigate(ROUTE_SHOES_CART)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Shoes")
        }




    }


}

@Preview
@Composable
private fun Categorypre() {
    Categoryscreen(rememberNavController())

}
