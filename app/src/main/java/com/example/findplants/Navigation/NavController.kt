package com.example.findplants.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.findplants.Screens.PlantsDetailsScreen
import com.example.findplants.Screens.SplashScreen

@Composable
fun NavController(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = Routes.plantsListScreen.Route) {
        composable(Routes.splashScreen.Route){
            SplashScreen()
        }
        composable(Routes.plantsListScreen.Route){
            PlantsDetailsScreen()
        }
    }
}