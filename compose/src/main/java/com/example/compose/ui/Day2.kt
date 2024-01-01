package com.example.compose.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Counter() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

/* // Example 1
        var count = remember {
            mutableStateOf(0)
        }


        Text(text = "Count =${count.value}")
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { count.value++ }) {
            Text(text = "Click me")
        }
*/

        // Example 2
        var count: Int by remember { mutableStateOf(0) }


        Text(text = "Count =${count}")
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { count++ }) {
            Text(text = "Click me")
        }

    }

}


//@Composable
//@Preview(showSystemUi = true)
//fun PreviewCounter() {
//     Counter()
//}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditText() {

    /* //Example 1

    var edtText: String by remember { mutableStateOf("Enter Something") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(value = edtText, onValueChange = {value -> edtText = value }) }
*/


    //Example 2
    var (edtText, onTextChanged) = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(value = edtText, onValueChange =  onTextChanged)
    }

}

@Preview(showSystemUi = true)
@Composable
fun EditTextPreview() {
    EditText()
}
