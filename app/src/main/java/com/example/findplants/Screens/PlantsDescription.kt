package com.example.findplants.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.findplants.R
import com.example.findplants.ui.theme.cardcolor
import com.example.findplants.ui.theme.fontpoppins
import com.example.findplants.ui.theme.priceColor
import com.example.findplants.ui.theme.primaryColor


@Composable
fun PlantsDescription(title: String?, description: String?, image: String?,price : String?,about : String?,navHostController: NavHostController) {

    var itemsCount by remember {
        mutableStateOf(0)
    }

    val scrollState = rememberScrollState()


    Surface {

        Column(modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(scrollState)
            .background(color = Color.White)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray)
                    .padding(25.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack, contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier
                        .size(40.dp)
                        .clickable {
                            navHostController.popBackStack()
                        }
                )

                Icon(
                    imageVector = Icons.Default.Favorite, contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier
                        .size(40.dp)
                )
            }
            Box (modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.LightGray), contentAlignment = Alignment.Center){
                Image(painter = painterResource(id = image.toString().toInt()), contentDescription = null,
                    modifier = Modifier
                        .size(290.dp))
            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomEnd = 40.dp))
                .background(color = Color.LightGray),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
                ) {
                Box (modifier = Modifier
                    .size(20.dp)
                    .clickable {
                        if (itemsCount > 0) {
                            itemsCount--;
                        }

                    }
                    .background(color = primaryColor),
                    contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_6),
                        contentDescription =null )
                }
                Text(text =itemsCount.toString(), fontSize = 22.sp,
                    fontFamily = fontpoppins,
                    modifier = Modifier.padding(5.dp))
                Box (modifier = Modifier
                    .size(20.dp)
                    .clickable {
                        itemsCount++;
                    }
                    .background(color = primaryColor),
                    contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_7),
                        contentDescription =null )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = title.toString(),
                color = Color.Black,
                modifier = Modifier.padding(start = 20.dp, bottom = 5.dp),
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp)
            Text(text = "Indoor",
                fontWeight = FontWeight.W400,
                color = Color.Black,
                modifier = Modifier.padding(start = 20.dp, bottom = 10.dp),
                fontSize = 17.sp)
            Box (modifier = Modifier
                .width(100.dp)
                .height(40.dp)
                .clip(RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp))
                .background(color = primaryColor)
                , contentAlignment = Alignment.CenterEnd){
                Text(text = price.toString(), color = Color.White,
                    fontFamily = fontpoppins,
                    fontSize = 20.sp, modifier = Modifier.padding(end = 10.dp))
            }
            Spacer(modifier = Modifier
                .height(10.dp)
                .background(color = Color.Black))

            Text(text = "About", textAlign = TextAlign.Center,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 10.dp),
                fontSize = 20.sp)
            Text(text =about.toString(),
                textAlign = TextAlign.Justify,
                color = Color.Black,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                fontSize =18.sp)

            Spacer(modifier = Modifier.fillMaxHeight(0.3f))
            Row(modifier = Modifier.padding(10.dp),
                verticalAlignment = Alignment.Bottom) {
                Surface(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(60.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .background(color = Color.LightGray)
                            .height(60.dp),
                        contentAlignment = Alignment.Center
                    ) {
                       Icon(imageVector = Icons.Default.ShoppingCart,
                           contentDescription =null, tint = Color.Black )
                    }
                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(start = 15.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = primaryColor),
                    contentAlignment = Alignment.Center) {
                    Text(text = "Buy Now", color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = fontpoppins,
                        fontSize = 20.sp)
                }
            }
        }
        }
}