package com.cossyyy.myapplication.ui.theme.screens.product

import android.content.Context
import android.content.res.Configuration
import android.net.Uri
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.cossyyy.myapplication.navigation.ROUTE_ADD_PRODUCT
import com.cossyyy.myapplication.navigation.ROUTE_SALE_PRODUCT


@Composable
fun AddProductsScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context = LocalContext.current
        Text(
            text = "Add product",
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Red,
            modifier = Modifier.padding(20.dp),
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )

        var productName by remember { mutableStateOf(TextFieldValue("")) }
        var productPrice by remember { mutableStateOf(TextFieldValue("")) }

        OutlinedTextField(
            value = productName,
            onValueChange = { productName = it },
            label = { Text(text = "Product name *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )



        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = productPrice,
            onValueChange = { productPrice = it },
            label = { Text(text = "Product price *") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(ROUTE_SALE_PRODUCT)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Buy")
        }



        //---------------------IMAGE PICKER START-----------------------------------//


        //---------------------IMAGE PICKER END-----------------------------------//

    }
}

//@Composable
//fun ImagePicker(modifier: Modifier = Modifier, context: Context, navController: NavHostController, name:String, quantity:String, price:String) {
//    var hasImage by remember { mutableStateOf(false) }
//    var imageUri by remember { mutableStateOf<Uri?>(null) }
//
//    val imagePicker = rememberLauncherForActivityResult(
//        contract = ActivityResultContracts.GetContent(),
//        onResult = { uri ->
//            hasImage = uri != null
//            imageUri = uri
//        }
//    )
//
//    Column(modifier = modifier,) {
//        if (hasImage && imageUri != null) {
//            val bitmap = MediaStore.Images.Media.
//            getBitmap(context.contentResolver,imageUri)
//            Image(bitmap = bitmap.asImageBitmap(), contentDescription = "Selected image")
//        }
//        Column(
//            modifier = Modifier.fillMaxWidth().padding(bottom = 32.dp), horizontalAlignment = Alignment.CenterHorizontally,) {
//            Button(
//                onClick = {
//                    imagePicker.launch("image/*")
//                },
//            ) {
//                Text(
//                    text = "Select Image"
//                )
//            }
//
//
//        }
//    }
//}


@Preview
@Composable
fun Addpr() {
    AddProductsScreen(rememberNavController())

}