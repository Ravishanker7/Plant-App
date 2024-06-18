package com.example.findplants.Screens

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.findplants.ui.theme.primaryColor


data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
)
@Preview
@Composable
fun BottomNav() {
    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }

    val items = listOf(
        BottomNavigationItem("Home",Icons.Default.Home,Icons.Outlined.Home),
        BottomNavigationItem("Ho",Icons.Default.Favorite,Icons.Outlined.Favorite),
        BottomNavigationItem("Home",Icons.Default.ShoppingCart,Icons.Outlined.ShoppingCart),
        BottomNavigationItem("Home",Icons.Default.Person,Icons.Outlined.Person)
    )
    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            bottomBar = {
                NavigationBar(modifier = Modifier) {    
                    items.forEachIndexed{index, item ->
                        NavigationBarItem(label = {
                            item.title
                        },
                            selected = selectedItemIndex==index,
                            icon = {
                                Icon(modifier = Modifier.size(35.dp),
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

        }
    }
}