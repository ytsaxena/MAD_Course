package com.example.compose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Uicomponents() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Hello Sachin")
        Button(onClick = {}) {
            Text(text = "Button")
        }

        // TextField(value = "Enter your name", onValueChange ={} )
    }

}

@Composable
fun RowUicomponents() {

    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Hello Sachin")
        Button(onClick = {}) {
            Text(text = "Button")
        }

        // TextField(value = "Enter your name", onValueChange ={} )
    }

}


@Composable
fun BoxUicomponents() {

    Box() {

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null
        )
        IconButton(onClick = {},
            modifier = Modifier.align(alignment = Alignment.BottomEnd)) {
            Icon(painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null)

        }

    }

}

//@Preview(showSystemUi = true)
//@Composable
//fun UiComponentsPreview() {
//    // Uicomponents()
//
//}


//@Preview(showSystemUi = true)
//@Composable
//fun RowUiComponentsPreview() {
//   // RowUicomponents()
//
//}

@Preview()
@Composable
fun BoxComponentsPreview() {
    BoxUicomponents()

}