package com.example.findplants.API

data class Data(
    val common_name: String,
    val cycle: String,
    val default_image: DefaultImage,
    val id: Int,
    val other_name: List<String>,
    val scientific_name: List<String>,
    val sunlight: List<String>,
    val watering: String
)