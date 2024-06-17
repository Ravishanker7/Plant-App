package com.example.findplants.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.findplants.R
import com.example.findplants.ui.theme.cardcolor
import com.example.findplants.ui.theme.fontpoppins
import com.example.findplants.ui.theme.priceColor
import com.example.findplants.ui.theme.primaryColor

@Preview(showBackground = true)
@Composable
fun PlantsDescription() {

    var itemsCount by remember {
        mutableStateOf("5")
    }
    Surface {
        Column(modifier = Modifier
            .fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray)
                    .padding(15.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack, contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                )

                Icon(
                    imageVector = Icons.Default.Favorite, contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                )
            }
            Box (modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.LightGray), contentAlignment = Alignment.Center){
                Image(painter = painterResource(id = R.drawable.img_3), contentDescription = null,
                    modifier = Modifier
                        .size(290.dp))
            }


            Row(modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomEnd = 40.dp))
                .background(color = Color.LightGray),
                horizontalArrangement = Arrangement.Center) {
                Icon(imageVector = Icons.Default.Add, contentDescription =null, tint = Color.Black )
                Text(text =itemsCount )
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription =null )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Monstera",
                modifier = Modifier.padding(start = 20.dp, bottom = 5.dp),
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp)
            Text(text = "Indoor",
                fontWeight = FontWeight.W400,
                modifier = Modifier.padding(start = 20.dp, bottom = 10.dp),
                fontSize = 17.sp)
            Box (modifier = Modifier
                .width(100.dp)
                .height(40.dp)
                .clip(RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp))
                .background(color = primaryColor)
                , contentAlignment = Alignment.CenterEnd){
                Text(text = "$200", color = Color.White,
                    fontFamily = fontpoppins,
                    fontSize = 20.sp, modifier = Modifier.padding(end = 10.dp))
            }
            Spacer(modifier = Modifier
                .height(10.dp)
                .background(color = Color.Black))

            Text(text = "About", textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 10.dp),
                fontSize = 20.sp)
            Text(text ="Monstera deliciosa, the Swiss cheese plant or split-leaf philodendron" +
                    " is a species of flowering plant native to tropical forests of southern Mexico, " +
                    "south to Panama. It has been introduced to many tropical areas, and has become a mildly " +
                    "invasive species in Hawaii, Seychelles, Ascension Island and the Society Islands.",
                textAlign = TextAlign.Justify,
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
                            .background(color = Color.LightGray),
                        contentAlignment = Alignment.Center
                    ) {
                       Icon(imageVector = Icons.Default.ShoppingCart,
                           contentDescription =null, tint = Color.Black )
                    }
                }
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
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