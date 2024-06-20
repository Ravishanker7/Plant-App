package com.example.findplants.Screens

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.findplants.PlantsDataModel.PlantsModel
import com.example.findplants.R
import com.example.findplants.ui.theme.cardcolor
import com.example.findplants.ui.theme.fontpoppins


@Composable
fun PlantCard(list : PlantsModel,onClick : ()->Unit) {
    Surface(modifier = Modifier.size(height = 280.dp, width = 200.dp).padding(5.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()
            .background(color = cardcolor)
            .clickable { onClick.invoke() }
            .clip(RoundedCornerShape(10.dp))) {
            Box (modifier = Modifier.padding(10.dp)
                .fillMaxWidth(), contentAlignment = Alignment.Center){
                Image(painter = painterResource(id = list.PlantImage),
                    modifier = Modifier.size(150.dp),
                    contentDescription = null)
            }
            Text(text = list.PlantName,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 10.dp),
                fontSize = 18.sp,
                fontFamily = fontpoppins,
                fontWeight = FontWeight.Bold)
            Text(text = list.PlantDescription,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 10.dp),
                fontSize = 12.sp,
                fontFamily = fontpoppins,
                fontWeight = FontWeight.Light)
            Text(text = list.PlantPrice,
                color = Color.Black,
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp),
                fontSize = 14.sp,
                fontFamily = fontpoppins,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Right)
        }

    }
}