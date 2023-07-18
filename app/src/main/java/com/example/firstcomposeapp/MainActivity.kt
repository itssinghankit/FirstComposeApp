package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
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
//    val state= remember{mutableStateOf("")}
//    TextField(
//        value = state.value,
//        onValueChange = {
//                        state.value=it
//        },
//        label = { Text(text = "name") },
//        placeholder={}
//    )


}

@Composable
@Preview(showBackground = true, name = "okji", widthDp = 300, heightDp = 500)
private fun PreviewFunc() {
    SayName()
}