package com.example.questadvancelayout_039

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Layout(modifier: Modifier){
    val gambar1 = painterResource(id = R.drawable.image1)
    val gambar2 = painterResource(id = R.drawable.image2)
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Data Mahasiswa",
            style = TextStyle(fontSize = 40.sp, fontWeight = FontWeight.Bold),
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = "Teknologi Informasi",
            style = TextStyle(fontSize = 28.sp, color = Color.Gray)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(color = Color.Yellow),
            contentAlignment = Alignment.Center
        ){
            Row() {
                Image(painter = gambar1,
                    contentDescription = null
                )
                Column(
                    modifier = modifier.fillMaxWidth()
                ) {
                    Text(text = "Hari Ramadhan",
                        style = TextStyle(
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive
                        )
                    )
                    Text(text = "Tlpn : +628765432123")
                }
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(color = Color.Yellow),
            contentAlignment = Alignment.Center
        ){
            Row() {
                Image(painter = gambar2,
                    contentDescription = null
                )
                Column(
                    modifier = modifier.fillMaxWidth()
                ) {
                    Text(text = "Hari Ramadhan",
                        style = TextStyle(
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive
                        )
                    )
                    Text(text = "Tlpn : +628765432123")
                }
            }
        }

        Spacer(modifier = Modifier.height(80.dp))

        Text(
            text = "© 2025 Windyaan",
            style = TextStyle(fontSize = 16.sp, color = Color.Gray)
        )
    }
}