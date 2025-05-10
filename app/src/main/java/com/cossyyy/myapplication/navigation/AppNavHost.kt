package com.cossyyy.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cossyyy.myapplication.ui.theme.screens.cart.FruitCartscreen
import com.cossyyy.myapplication.ui.theme.screens.cart.JuiceCartscreen
import com.cossyyy.myapplication.ui.theme.screens.cart.ShoesCartscreen
import com.cossyyy.myapplication.ui.theme.screens.cart.VegetableCartscreen
import com.cossyyy.myapplication.ui.theme.screens.category.Categoryscreen
import com.cossyyy.myapplication.ui.theme.screens.cover.coverscreen
import com.cossyyy.myapplication.ui.theme.screens.login.LoginScreen
import com.cossyyy.myapplication.ui.theme.screens.product.AddProductsScreen
import com.cossyyy.myapplication.ui.theme.screens.product.Saleproductscreen

import com.cossyyy.myapplication.ui.theme.screens.register.RegisterScreen


@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),startDestination:String= ROUTE_COVER) {

    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable (ROUTE_COVER){
               coverscreen(navController)
        }
        composable(ROUTE_FRUIT_CART){
            FruitCartscreen(navController)
        }
        composable(ROUTE_CATEGORY){
            Categoryscreen(navController)
        }
        composable(ROUTE_JUICE_CART){
            JuiceCartscreen(navController)
        }
        composable(ROUTE_VEGETABLE_CART){
            VegetableCartscreen(navController)
        }
        composable(ROUTE_SHOES_CART){
            ShoesCartscreen(navController)
        }
        composable(ROUTE_SALE_PRODUCT){
            Saleproductscreen(navController)

        }
        composable(ROUTE_ADD_PRODUCT){
            AddProductsScreen(navController)
        }






    }

}