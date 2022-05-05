package com.example.mynavdemo

sealed class NavRoutes(val route: String) {
    object UpperBody : NavRoutes("UpperBody")
    object Home : NavRoutes("Home")
    object LowerBody : NavRoutes("LowerBody")
    object Cardio : NavRoutes("Cardio")
    object Abs : NavRoutes("Abs")
    object Balance : NavRoutes("Balance")
    object Other : NavRoutes("Other")
}
