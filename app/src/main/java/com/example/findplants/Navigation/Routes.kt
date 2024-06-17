package com.example.findplants.Navigation

sealed class Routes(val Route : String) {

    object splashScreen: Routes("Splash_Screen")

    object plantsListScreen : Routes("Plants_ListScreen")

    object plantsDetailScreen : Routes("Plants_DetailsScreen")

}