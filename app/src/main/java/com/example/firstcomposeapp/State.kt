package com.example.firstcomposeapp

import android.icu.lang.UCharacter.VerticalOrientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.integerArrayResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Preview(showSystemUi = true)
@Composable
fun PreviewFunction(){
    val count = rememberSaveable{
        mutableStateOf(0)
    }
    Column() {
        ButtonState(count.value,{count.value++})
        SecondFunc(count.value)
    }

}


@Composable
fun SecondFunc(count: Int) {
    Card(elevation = CardDefaults.cardElevation(4.dp)) {
        Text(text = "the number of count is $count")
    }
}

@Composable
fun ButtonState(count: Int,increment:()->Unit) {

    Column() {

        Text(text = "the value count is ${count}")
        Button(onClick = { increment() }) {
            Text(text = "Increment")
        }
    }
}