package com.example.assignmentthree.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginIcon(){
    Box(
        modifier = Modifier
            .background(Color.DarkGray)
            .size(180.dp,200.dp)
    )
}