package com.example.assignmentthree.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginFields() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val username = remember {
            mutableStateOf("")
        }
        val password = remember {
            mutableStateOf("")
        }
        // Title
        Text(
            text = "Login screen",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(50.dp))

        // Username text field
        TextField(
            value = username.value,
            label = { Text(text = "Username") },
            onValueChange = {},
        )

        Spacer(modifier = Modifier.height(30.dp))


        // Password text field
        TextField(
            value = password.value,
            onValueChange = {},
            label = { Text(text = "Password") },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default,

            )

        Spacer(modifier = Modifier.height(50.dp))

        // Submit button
        Button(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = { /*TODO: Handle login*/ },
        ) {
            Text("Submit")
        }
    }
}
