package com.example.findplants.PlantsDataModel

import com.example.findplants.R

data class PlantsModel(
    val PlantName : String,
    val PlantImage : Int,
    val PlantDescription : String,
    val PlantPrice : String,
    val plantDetailDescription : String
)

fun getPlants() : List<PlantsModel>{
    return listOf(
        PlantsModel("Monstera", R.drawable.img_2, "Indoor", "$200",
            "Monstera deliciosa, the Swiss cheese plant or split-leaf philodendron is a species of flowering plant native to tropical forests of southern Mexico, south to Panama. It has been introduced to many tropical areas, and has become a mildly invasive species in Hawaii, Seychelles, Ascension Island and the Society Islands."),
        PlantsModel("Fiddle Leaf Fig", R.drawable.img_3, "Indoor", "$180",
            "Ficus lyrata, commonly known as the fiddle-leaf fig, is a species of flowering plant in the mulberry and fig family Moraceae. It is native to western Africa, from Cameroon west to Sierra Leone, where it grows in lowland tropical rainforest."),
        PlantsModel("Snake Plant", R.drawable.img_4, "Indoor", "$50",
            "Sansevieria trifasciata, also known as the snake plant, mother-in-law's tongue, and viper's bowstring hemp, is a species of flowering plant in the family Asparagaceae, native to West Africa from Nigeria east to the Congo."),
        PlantsModel("Spider Plant", R.drawable.img_5, "Indoor", "$30",
            "Chlorophytum comosum, often called spider plant but also known as airplane plant, St. Bernard's lily, spider ivy, and ribbon plant, is a species of perennial flowering plant. It is native to tropical and southern Africa but has become naturalized in other parts of the world."),
        PlantsModel("Peace Lily", R.drawable.img_5, "Indoor", "$35",
            "Spathiphyllum is a genus of about 47 species of monocotyledonous flowering plants in the family Araceae, native to tropical regions of the Americas and southeastern Asia. Certain species of Spathiphyllum are commonly known as spath or peace lilies."),
        PlantsModel("Aloe Vera", R.drawable.img_10, "Indoor", "$25",
            "Aloe vera is a succulent plant species of the genus Aloe. It grows wild in tropical, semi-tropical, and arid climates around the world. It is cultivated for agricultural and medicinal uses."),
        PlantsModel("Rubber Plant", R.drawable.img_8, "Indoor", "$60",
            "Ficus elastica, the rubber fig, rubber bush, rubber tree, rubber plant, or Indian rubber bush is a species of plant in the fig genus, native to eastern parts of South Asia and Southeast Asia."),
        PlantsModel("ZZ Plant", R.drawable.img_9, "Indoor", "$45",
            "Zamioculcas zamiifolia, commonly known as the ZZ plant, is a tropical perennial plant native to eastern Africa, from southern Kenya to northeastern South Africa. It is grown as an ornamental plant, mainly for its attractive glossy foliage and easy maintenance."),
        PlantsModel("Jade Plant", R.drawable.img_10, "Indoor", "$40",
            "Crassula ovata, commonly known as jade plant, lucky plant, money plant, or money tree, is a succulent plant native to South Africa and Mozambique. It is popular as a houseplant worldwide."),
        PlantsModel("Pothos", R.drawable.img_11, "Indoor", "$20",
            "Epipremnum aureum, commonly known as golden pothos, devil's ivy, or money plant, is a species of flowering plant in the family Araceae, native to Mo'orea in the Society Islands of French Polynesia."),
        PlantsModel("Boston Fern", R.drawable.img_12, "Indoor", "$25",
            "Nephrolepis exaltata, known as the Boston fern or sword fern, is a species of fern in the family Lomariopsidaceae, native to tropical regions throughout the world. It is commonly grown as a houseplant and in gardens."),
        PlantsModel("Bird of Paradise", R.drawable.img_13, "Indoor", "$120",
            "Strelitzia is a genus of five species of perennial plants, native to South Africa. It belongs to the plant family Strelitziaceae. The common name 'bird of paradise' is derived from the flower's resemblance to a brightly colored bird in flight."),
        PlantsModel("Calathea", R.drawable.img_14, "Indoor", "$35",
            "Calathea is a genus of plants belonging to the family Marantaceae. They are commonly called calatheas or (like their relatives) prayer plants. The most common of the species are native to tropical South America."),
        PlantsModel("Philodendron", R.drawable.img_15, "Indoor", "$50",
            "Philodendron is a large genus of flowering plants in the family Araceae. They are native to tropical America and are popular as indoor plants because of their attractive foliage and ability to thrive in low-light conditions."),
        PlantsModel("Chinese Evergreen", R.drawable.img_16, "Indoor", "$30",
            "Aglaonema, commonly known as Chinese evergreen, is a genus of flowering plants in the arum family, Araceae. They are native to tropical and subtropical regions of Asia and New Guinea and are widely grown as houseplants for their attractive foliage."),
        PlantsModel("Orchid", R.drawable.img_17, "Indoor", "$40",
            "Orchids are a diverse and widespread family of flowering plants, with blooms that are often colorful and fragrant. They are known for their complex flower structures and are found in almost every habitat except glaciers.")

        )
}