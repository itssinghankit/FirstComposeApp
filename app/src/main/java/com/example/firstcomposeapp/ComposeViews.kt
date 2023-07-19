package com.example.firstcomposeapp

import android.icu.number.Scale
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun PreviewFunc(){
     LazyColumn(content = {
         items(getCatagoryList()){item->
             Blogcatagory(imgId = item.img, title = item.title, subtitle = item.subtitle)
         }
     })


}

@Composable
fun Blogcatagory(imgId:Int, title:String,subtitle:String) {
    Card(elevation = CardDefaults.cardElevation(4.dp), modifier = Modifier.padding(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
            .background(Color.White)
            .padding(8.dp) ){
            Image(
                painter = painterResource(id = imgId),
                contentDescription = "meow", contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .clip(CircleShape)
                    .weight(.1f)
            )
            Description(title, subtitle, Modifier.Companion.weight(.6f))
        }
    }
}

@Composable
private fun Description(title: String, subtitle: String,modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = title, color = Color.Black, fontWeight = FontWeight.Bold)
        Text(
            text = subtitle,
            color = Color.Gray,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp
        )
    }
}

data class Catagory(val img:Int, val title:String, val subtitle:String)

fun getCatagoryList(): MutableList<Catagory> {
    val list= mutableListOf<Catagory>()
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))
    list.add(Catagory(R.drawable.alkadi,"Programming","Learn something new"))

    return list
}