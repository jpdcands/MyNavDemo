package com.example.mynavdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mynavdemo.screens.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                //    color = MaterialTheme.colors.primarySurface,
                color = Color.Green,
                modifier = Modifier.fillMaxSize()
            ) {
                MainScreen()

            }
        }
    }
}

@Composable
fun MainScreen() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.Home.route,
    ) {
        composable(NavRoutes.Home.route) {
            Home(navController = navController)
        }
        composable(NavRoutes.UpperBody.route) {
            UpperBody(navController = navController)
        }
        composable(NavRoutes.LowerBody.route) {
            LowerBody(navController = navController)
        }
        composable(NavRoutes.Cardio.route) {
            Cardio(navController = navController)
        }
        composable(NavRoutes.Abs.route) {
            Abs(navController = navController)
        }
        composable(NavRoutes.Balance.route) {
            Balance(navController = navController)
        }
        composable(NavRoutes.Other.route) {
            Other(navController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}

