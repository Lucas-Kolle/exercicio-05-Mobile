package com.example.quizatron3000.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.quizatron3000.R

@Composable
fun QuizImage(modifier: Modifier = Modifier) {

    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.quiz),
        contentDescription = "Android Enemy"
    )

}