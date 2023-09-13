package com.example.assignmentthree.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            brush = Brush.linearGradient(
                colors = listOf(
                    Color.Cyan,
                    Color.Magenta
                )
            )
        )
        .padding(16.dp),
    ) {
        Alignment.CenterHorizontally
        Arrangement.Center


        val username = remember {
            mutableStateOf("")
        }
        val password = remember {
            mutableStateOf("")
        }

        // Title
        Text(
            text = "Login screen",
            color = Color(91, 4, 40),
            style = MaterialTheme.typography.headlineMedium,
//            modifier = Modifier
        )

        Spacer(modifier = Modifier.height(50.dp))

        // Username text field
        OutlinedTextField(
            value = username.value,
            label = { Text(text = "Username") },
            onValueChange = {},
        )

        Spacer(modifier = Modifier.height(30.dp))


        // Password text field
        OutlinedTextField(
            value = password.value,
            onValueChange = {},
            label = { Text(text = "Password") },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default,

            )
    }
}