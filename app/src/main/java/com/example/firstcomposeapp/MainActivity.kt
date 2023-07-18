package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcomposeapp.ui.theme.FirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeAppTheme {
                // A surface container using the 'background' color from the theme
//                Greeting("Android")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SayName() {

//    Text(
//        text = "hello $name",
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.Bold,
//        color = Color.Red,
//        fontSize = 20.sp,
//        textAlign = TextAlign.Center
//    )
//    Image(
//        painter = painterResource(id = R.drawable.alkadi),
//        contentDescription = "hello ji",
//        colorFilter = ColorFilter.lighting(Color.Green, Color.Red),
//        contentScale = ContentScale.Crop
//    )
//    Button(
//        onClick = { /*TODO*/ },
//        colors = ButtonDefaults.buttonColors(contentColor = Color.Red, containerColor = Color.Blue),
//        shape = MaterialTheme.shapes.small
//    ) {
//        Text(text = "Hello")
//        Image(painter = painterResource(id = R.drawable.alkadi), contentDescription = "hello")
//
//    }
//   Column(verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
//       Text(text = "A")
//       Text(text = "B")
//   }
//    Row(horizontalArrangement = Arrangement.SpaceAround, verticalAlignment = Alignment.CenterVertically) {
//        Text(text = "A")
//        Text(text = "B")
//    }
//    Box(contentAlignment = Alignment.BottomCenter){
//        Image(painter = painterResource(id = R.drawable.alkadi), contentDescription = "meow")
//        Text(text = "hello")
//    }


}

//@Composable
//private fun ListViewItem(imgId:Int,name:String,occupation:String,modifier: Modifier){
//    Row(modifier.padding(8.dp)) {
//
//        Image(painter = painterResource(id = imgId), contentDescription = "meow",Modifier.size(40.dp))
//
//        Column() {
//            Text(text = name, fontWeight = FontWeight.Bold)
//            Text(text = occupation, fontWeight = FontWeight.Thin, fontSize = 12.sp)
//        }
//    }
//}

//@Composable
//private fun textshow(){
//    Text(text = "hello", color = Color.Red, modifier = Modifier
//        .padding(8.dp)
//        .background(Color.Blue)
//        .size(40.dp)
//        .border(2.dp, Color.Black)
//        .clip(CircleShape)
//        .background(Color.Yellow)
//        .clickable {  }
//
//    )
//}

@Composable
private fun CircularImage() {
    Image(
        painter = painterResource(id = R.drawable.alkadi),
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(40.dp).clip(CircleShape).border(2.dp, Color.Black, CircleShape).shadow(8.dp,
            CircleShape),
        contentDescription = "meow"
    )
}

@Composable
@Preview(showBackground = true, name = "okji")
private fun PreviewFunc() {
//    SayName()
//    Column() {
//        ListViewItem(imgId = R.drawable.alkadi, name = "Ankit singh", occupation = "Software Engineer",Modifier)
//        ListViewItem(imgId = R.drawable.alkadi, name = "Ankit singh", occupation = "Software Engineer",Modifier)
//        ListViewItem(imgId = R.drawable.alkadi, name = "Ankit singh", occupation = "Software Engineer",Modifier)
//        ListViewItem(imgId = R.drawable.alkadi, name = "Ankit singh", occupation = "Software Engineer",Modifier)
//    }
//    textshow()
    CircularImage()
}