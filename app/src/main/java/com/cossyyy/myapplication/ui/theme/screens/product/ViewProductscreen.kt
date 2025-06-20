package com.cossyyy.myapplication.ui.theme.screens.product

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import com.cossyyy.myapplication.data.productviewmodel
import com.cossyyy.myapplication.model.Product

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.cossyyy.myapplication.navigation.ROUTE_REGISTER


@Composable
fun ViewProductsScreen(navController:NavHostController) {
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        val context = LocalContext.current
        val productRepository = productviewmodel(navController, context)
        val emptyProductState = remember { mutableStateOf(Product("","","","")) }
        val emptyProductsListState = remember { mutableStateListOf<Product>() }

        val products = productRepository.viewProducts(emptyProductState, emptyProductsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All products",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn{
                items(products){
                    ProductItem(
                        name = it.name,
                        quantity = it.quantity,
                        price = it.price,
                        id = it.id,
                        navController = navController,

                    )
                }
            }
        }
    }

}

@Composable
fun ProductItem(name:String, quantity:String, price:String, id:String,
                navController:NavHostController) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = name)
        Text(text = quantity)
        Text(text = price)
        Button(onClick = { TODO() }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            navController.navigate("$ROUTE_REGISTER/$id")
        }) {
            Text(text = "Update")
        }
    }

}

@Preview
@Composable
fun ViewProducts() {
    ViewProductsScreen(rememberNavController())

}