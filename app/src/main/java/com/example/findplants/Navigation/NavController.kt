package com.example.findplants.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
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
        composable(
            route = Routes.PlantsDetailScreen.Route,
            arguments = listOf(
                navArgument("title") { type = NavType.StringType },
                navArgument("description") { type = NavType.StringType },
                navArgument("image") { type = NavType.StringType },
                navArgument("Price"){type=NavType.StringType},
                navArgument("About"){type=NavType.StringType}
            )
        ) { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title")
            val description = backStackEntry.arguments?.getString("description")
            val image = backStackEntry.arguments?.getString("image")
            val price=backStackEntry.arguments?.getString("Price")
            val about=backStackEntry.arguments?.getString("About")
            PlantsDescription(title, description, image,price,about,navHostController)
        }
    }
}