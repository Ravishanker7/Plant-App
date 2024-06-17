package com.example.findplants.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.findplants.Screens.PlantsDescription
import com.example.findplants.Screens.PlantsDetailsScreen
import com.example.findplants.Screens.SplashScreen

@Composable
fun NavController(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = Routes.splashScreen.Route) {
        composable(Routes.splashScreen.Route){
            SplashScreen(navHostController)
        }
        composable(Routes.plantsListScreen.Route){
            PlantsDetailsScreen(navHostController)
        }
        composable(Routes.plantsDetailScreen.Route){
            PlantsDescription()
        }
    }
}