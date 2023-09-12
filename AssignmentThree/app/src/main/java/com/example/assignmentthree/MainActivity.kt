package com.example.assignmentthree

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScopeInstance.align
import androidx.compose.foundation.layout.RowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
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
                    MainScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

    val username = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .background( shape = RoundedCornerShape(25.dp),
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color.Cyan,
                        Color.Green,
                    )
                )
            )
    )

    Text(
        text = "Login screen",
        style = MaterialTheme.typography.headlineMedium,
        modifier = Modifier
            .align(Alignment)
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
