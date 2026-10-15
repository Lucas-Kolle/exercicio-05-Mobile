package com.example.quizatron3000.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NumeroPergunta(
    modifier: Modifier = Modifier,
    numeroPergunta: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(Color(0xFF51BB7A))
            .width(280.dp)
            .height(60.dp)
            .border(1.dp, Color.Black)
    ) {
        Text(
            text = "Pergunta $numeroPergunta de 3",
            fontSize = 30.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black
        )
    }
}