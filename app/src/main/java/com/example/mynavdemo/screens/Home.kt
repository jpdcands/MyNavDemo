package com.example.mynavdemo.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mynavdemo.NavRoutes

@Composable
fun Home(navController: NavHostController) {
    Row(
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.size(width = 800.dp, height = 600.dp)) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { navController.navigate("UpperBody") },
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                )
            ) {
                Text(text = "UpperBody")
            }
            Button(
                onClick = {},
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                )
            ) {
                Text(text = "Abs")
            }
            Button(
                onClick = {},
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                )
            ) {
                Text(text = "Balance")
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {},
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                )
            ) {
                Text(text = "Lower Body")
            }
            Button(
                onClick = {},
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                )
            ) {
                Text(text = "Cardio")
            }
            Button(
                onClick = {},
                Modifier.padding(20.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(3.dp, Color.Black),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    backgroundColor = Color.Red
                )
            ) {
                Text(text = "Other ")
            }
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Home()
}*/
