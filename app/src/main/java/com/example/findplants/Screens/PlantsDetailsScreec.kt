package com.example.findplants.Screens

import android.media.Image
import android.net.Uri
import android.provider.MediaStore.Images
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.findplants.Navigation.Routes
import com.example.findplants.PlantsDataModel.getPlants
import com.example.findplants.R
import com.example.findplants.ui.theme.fontpoppins
import com.example.findplants.ui.theme.primaryColor


@Composable
fun PlantsDetailsScreen(navHostController: NavHostController) {

    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }

    val items = listOf(
        BottomNavigationItem("Home",Icons.Default.Home,Icons.Outlined.Home),
        BottomNavigationItem("Ho",Icons.Default.Favorite,Icons.Outlined.Favorite),
        BottomNavigationItem("Home",Icons.Default.ShoppingCart,Icons.Outlined.ShoppingCart),
        BottomNavigationItem("Home",Icons.Default.Person,Icons.Outlined.Person)
    )


    var textsearch by remember {
        mutableStateOf(" ")
    }
    Scaffold(
        bottomBar = {
            NavigationBar(modifier = Modifier.background(color = Color.White), containerColor = Color.White) {
                items.forEachIndexed{index, item ->
                    NavigationBarItem(modifier = Modifier
                        .height(80.dp)
                        .fillMaxWidth()
                        .background(color = Color.White),
                        selected = selectedItemIndex==index,
                        icon = {
                            Icon(modifier = Modifier.size(30.dp),
                                imageVector = if (index == selectedItemIndex) {
                                    item.selectedIcon
                                }else{
                                    item.unselectedIcon
                                }, contentDescription = item.title,
                            )
                        },
                        onClick = { selectedItemIndex=index })
                }
            }
        }
    ) {
        it
        Column(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(20.dp)) {

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Icon(imageVector = Icons.Default.Menu, contentDescription =null,
                    tint = Color.Black,
                    modifier = Modifier
                        .size(40.dp))

                Icon(imageVector = Icons.Default.AccountBox, contentDescription =null,
                    tint = Color.Black,
                    modifier = Modifier
                        .size(40.dp))
            }


            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Let’s Find" +"\n"+
                    "Your Plants!",
                modifier = Modifier.padding(10.dp),
                color = Color.Black,
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = fontpoppins)

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)) {
                OutlinedTextField(value = textsearch, onValueChange = {
                    textsearch = it
                }, leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color.Gray
                    )
                })

                Surface(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(50.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .background(color = primaryColor),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_1),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
            getPlants().shuffled()
            LazyVerticalGrid(columns = GridCells.Fixed(2),
                modifier = Modifier.padding(10.dp)) {
                items(getPlants()){
                    PlantCard(list = it, onClick = {
                        val encodedTitle = it.PlantName
                        val encodedDescription = Uri.encode(it.PlantDescription)
                        val encodedImage = Uri.encode(it.PlantImage.toString())
                        val Price=it.PlantPrice
                        val about=it.plantDetailDescription
                        val route = "plantsDetailScreen/$encodedTitle/$encodedDescription/$encodedImage/$Price/$about"
                        navHostController.navigate(route)
                    })
                }
            }

        }
    }

}