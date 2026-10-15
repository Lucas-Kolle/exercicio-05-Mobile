package com.example.quizatron3000.screens

import android.R.attr.fontWeight
import android.R.attr.onClick
import android.icu.number.Scale.none
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizatron3000.R
import com.example.quizatron3000.components.NumeroPergunta
import com.example.quizatron3000.components.QuizImage
import org.w3c.dom.Text

@Composable
fun FisrtQuestionScreen(modifier: Modifier = Modifier) {

    var statusResposta = 1000

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.backgroundQuestion))
            .padding(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        QuizImage(
            modifier = Modifier.size(60.dp)
        )

        NumeroPergunta(
            modifier = Modifier,
            numeroPergunta = "1"
        )

        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(1.dp)
        ) {
            Text(
                text = "Qual a capital da França?",
                fontSize = 25.sp,
                fontWeight = FontWeight.Medium
            )

            OutlinedButton(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text(
                    text = "Londres",
                    color = Color.Black,
                    fontSize = 20.sp
                )
            }

        }
    }
}