package com.example.composer

sealed class Routes(val route: String) {
    object Login : Routes("Login")
}