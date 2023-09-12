package com.example.assignmentthree

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignmentthree.ui.theme.AssignmentThreeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignmentThreeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    LinearGradient()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LinearGradient() {
    Column(
        modifier = Modifier
            .fillMaxSize().
                        background(brush = Brush.verticalGradient(
                colors = listOf(
                    Color.Cyan,
                    Color.Magenta
                )
            )).
            padding(16.dp),
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
            label = { Text(text = "Username")},
            onValueChange = {},
        )

        Spacer(modifier = Modifier.height(30.dp))


        // Password text field
        TextField(
            value = password.value,
            onValueChange = {},
            label = { Text(text = "Password")},
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default,

            )

        Spacer(modifier = Modifier.height(50.dp))

        // Submit button
//        val teal200 = Color(0xFF03DAC5)
        Button(
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color.White,
//                contentColor = teal200),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = { /*TODO: Handle login*/ },
        ) {
            Text("Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LinearGradientPreview() {
    LinearGradient ()
}