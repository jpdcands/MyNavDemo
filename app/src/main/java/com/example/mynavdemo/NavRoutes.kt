package com.example.mynavdemo

sealed class NavRoutes(val route: String) {
    object UpperBody : NavRoutes("UpperBody")
    object Home : NavRoutes("Home")
    object LowerBody : NavRoutes("LowerBody")
}
