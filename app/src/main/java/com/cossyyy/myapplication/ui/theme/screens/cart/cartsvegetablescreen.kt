package com.cossyyy.myapplication.ui.theme.screens.cart

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.cossyyy.myapplication.R
import com.cossyyy.myapplication.R.drawable.mango
import com.cossyyy.myapplication.navigation.ROUTE_SALE_PRODUCT

@Composable
fun VegetableCartscreen(navController: NavHostController) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.Black)
    ){
        Text(
            text = "Our Vegetable Products",
            modifier = Modifier.padding(16.dp),
            fontSize = 30.sp,
            color = Color.Red,
            fontFamily = FontFamily.Serif



        )
        Card(
            modifier=Modifier
                .padding(16.dp)
                .wrapContentSize()



        ){
            Row (
                modifier=Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Image(
                    painter = painterResource(id = R.drawable.sukumawiki),
                    contentDescription = "project",
                    Modifier
                        .size(140.dp)
                )
                Column (
                    Modifier.padding(12.dp)){
                    Text(
                        text = "Sukumawiki",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold

                    )
                    Text(
                        text = "100",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold


                    )
                    Button(onClick = {
                        navController.navigate(ROUTE_SALE_PRODUCT)
                    }, modifier = Modifier.fillMaxWidth()) {
                        Text(text = "Buy")
                    }









                }
            }

        }
        Card(
            modifier=Modifier
                .padding(16.dp)
                .wrapContentSize()



        ){
            Row (
                modifier=Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Image(
                    painter = painterResource(id =R.drawable.cabagge),
                    contentDescription = "mango",
                    modifier = Modifier
                        .size(140.dp)
                )
                Column (
                    Modifier.padding(12.dp)){
                    Text(
                        text = "Cabagge",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold

                    )
                    Text(
                        text = "50",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold


                    )
                    Button(onClick = {
                        navController.navigate(ROUTE_SALE_PRODUCT)
                    }, modifier = Modifier.fillMaxWidth()) {
                        Text(text = "Buy")
                    }









                }
            }

        }
        Card(
            modifier=Modifier
                .padding(16.dp)
                .wrapContentSize()



        ){
            Row (
                modifier=Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Image(
                    painter = painterResource(id = R.drawable.spinach),
                    contentDescription = "banana",
                    modifier = Modifier
                        .size(140.dp)
                )
                Column (
                    Modifier.padding(12.dp)){
                    Text(
                        text = "Spinnach",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold

                    )
                    Text(
                        text = "50",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold


                    )
                    Button(onClick = {
                        navController.navigate(ROUTE_SALE_PRODUCT)
                    }, modifier = Modifier.fillMaxWidth()) {
                        Text(text = "Buy")
                    }









                }
            }

        }
        Card(
            modifier=Modifier
                .padding(16.dp)
                .wrapContentSize()



        ){
            Row (
                modifier=Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Image(
                    painter = painterResource(id = R.drawable.spinach),
                    contentDescription = "banana",
                    modifier = Modifier
                        .size(140.dp)
                )
                Column (
                    Modifier.padding(12.dp)){
                    Text(
                        text = "Greens",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold

                    )
                    Text(
                        text = "50",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold


                    )
                    Button(onClick = {
                        navController.navigate(ROUTE_SALE_PRODUCT)
                    }, modifier = Modifier.fillMaxWidth()) {
                        Text(text = "Buy")
                    }









                }
            }

        }









    }




}









































@Preview
@Composable
private fun vegetablecartpre() {
    VegetableCartscreen(rememberNavController())

}