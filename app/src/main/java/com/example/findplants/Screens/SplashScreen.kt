package com.example.findplants.Screens

import android.content.pm.ModuleInfo
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.findplants.Navigation.Routes
import com.example.findplants.R
import com.example.findplants.ui.theme.primaryColor


@Preview(showBackground = true)
@Composable
fun SplashScreen() {
    val fontpoppins = FontFamily(
        Font(R.font.poppinssemibold,FontWeight.SemiBold)
    )
    Surface(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.img), contentDescription =null )
            Box (modifier = Modifier.fillMaxSize(),
               ){
                    Column(modifier = Modifier.fillMaxSize(),
                       // verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Spacer(modifier = Modifier.fillMaxHeight(0.4f))
                        Text(text = "Find Plants",
                            color = Color.White,
                            fontSize = 40.sp,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Medium,
                            fontFamily = fontpoppins,
                            fontStyle = FontStyle.Normal,
                        )
                        Spacer(modifier = Modifier.height(120.dp))
                        Text(text = "Find your favorite\n" +
                                "plants on our shop",
                            color = Color.White,
                            fontSize = 30.sp,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Normal,
                            fontFamily = fontpoppins,
                            fontStyle = FontStyle.Normal,
                        )
                        Spacer(modifier = Modifier.height(100.dp))
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(1.dp),
                            modifier = Modifier
                                .size(250.dp, 60.dp),
                                    colors = buttonColors(primaryColor)) {
                            Text(text = "Get Started",
                                fontFamily = fontpoppins,
                                fontSize = 20.sp)
                        }

                    }

            }
    }
}