package com.example.mvvmregistration.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmregistration.uiLayer.screens.signInScreen
import com.example.mvvmregistration.uiLayer.screens.signUpScreen


sealed class Screen (val route : String){

    object SignIn : Screen("signIn") // create a route to the sign in screen
    object SignUp : Screen("signUp")// create a route to the sign up screen

}


@Composable
fun AppNavigation(){

    val navController = rememberNavController()

    NavHost(navController = navController , startDestination = Screen.SignIn.route) {
        composable(Screen.SignIn.route) {
            signInScreen(navController)
        }

        composable(Screen.SignUp.route) {
            signUpScreen(navController)
        }
    }

}
