package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

@Composable
fun SayName(name:String){
    Text(text = "hello $name")
}

@Composable
@Preview(showBackground = true, name = "okji", widthDp = 100, heightDp = 200)
private fun PreviewFunc(){
    SayName(name = "Ankit")
}