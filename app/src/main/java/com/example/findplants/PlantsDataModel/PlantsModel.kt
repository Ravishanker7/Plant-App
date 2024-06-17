package com.example.findplants.PlantsDataModel

import com.example.findplants.R

data class PlantsModel(
    val PlantName : String,
    val PlantImage : Int,
    val PlantDescription : String,
    val PlantPrice : String
)

fun getPlants() : List<PlantsModel>{
    return listOf(
        PlantsModel("Monstera", R.drawable.img_2,"Indoor","$200"),
        PlantsModel("Fiddle Leaf Fig", R.drawable.img_3, "Indoor", "$180"),
        PlantsModel("Snake Plant", R.drawable.img_4, "Indoor", "$50"),
        PlantsModel("Spider Plant", R.drawable.img_5, "Indoor", "$30"),
    )
}