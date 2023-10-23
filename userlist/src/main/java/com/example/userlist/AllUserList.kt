package com.example.userlist

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.userlist.ui.theme.Users
import com.example.userlist.ui.theme.users


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AllUserList(userslist: List<Users>) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.app_name)) },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.tertiary
                )
            )
        }
    )
    { it ->
        LazyColumn(modifier = Modifier.fillMaxWidth(), contentPadding = it) {

            items(userslist) { users ->

                UserlistItem(users.userId, users.userName, users.fullName, users.email)


            }


        }


    }

}


@Preview
@Composable
fun alluserpreview() {
    AllUserList(userslist = users)

}