package com.example.quizatron3000.screens

import android.R.attr.label
import android.R.attr.text
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quizatron3000.R
import com.example.quizatron3000.components.BotaoPadrao
import com.example.quizatron3000.components.QuizImage

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {

    var nomeUsuario by remember {
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.backgroundLogin))
            .padding(vertical = 120.dp, horizontal = 25.dp)
    ) {

        QuizImage(
            modifier = Modifier.size(150.dp)
        )

        Text(
            text = "QUIZATRON 3000",
            fontSize = 34.sp,
            fontWeight = FontWeight.Medium
        )

        OutlinedTextField(
            value = nomeUsuario,
            onValueChange = { nomeUsuario = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Nome") },
            placeholder = { Text(text = "Digite seu nome")},
        )

        BotaoPadrao(
            modifier = Modifier.width(200.dp),
            textoBotao = "COMEÇAR!",
            onClick = {}
        )

    }
}