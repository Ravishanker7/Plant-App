package com.example.findplants.Navigation

import com.example.findplants.Navigation.Routes.plantsListScreen.Route
import com.example.findplants.Navigation.Routes.splashScreen.Route

sealed class Routes(val Route : String) {

    object splashScreen: Routes("Splash_Screen")

    object plantsListScreen : Routes("Plants_ListScreen")

    object PlantsDetailScreen : Routes("plantsDetailScreen/{title}/{description}/{image}/{Price}")



}
data class Route(val Route: String)