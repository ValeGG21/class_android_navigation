package com.example.actividad_compose_navegation.ControllerNavegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.actividad_compose_navegation.screen.Horizontal
import com.example.actividad_compose_navegation.screen.parte4
import com.example.actividad_compose_navegation.screen.parte4

@Composable
fun NavComponent(){
    val navegationController = rememberNavController()
    NavHost(navController = navegationController, startDestination = "view_1"){
        composable(route="view_1"){
            Horizontal(navegationController)
        }
        composable(route="view_2"){
            parte4(navegationController)
        }
    }
}