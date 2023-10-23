package com.example.userlist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.userlist.ui.theme.users

@Composable
fun UserlistItem(userId: Long, userName: String, fullName: String, email: String) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = MaterialTheme.shapes.large,
        elevation = CardDefaults.cardElevation(3.dp)
    ) {


        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "name",
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.onSurface,
            )
            Text(
                text = "description",
                style = MaterialTheme.typography.bodySmall,
            )
        }
    }






}


@Preview
@Composable
fun userlistitempreview(){
    UserlistItem(userId = users.get(0).userId, userName = users.get(0).userName, fullName = users.get(0).fullName , email = users.get(0).email)
}