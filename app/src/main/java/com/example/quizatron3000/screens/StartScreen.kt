package com.example.quizatron3000.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quizatron3000.R
import com.example.quizatron3000.components.BotaoPadrao
import com.example.quizatron3000.components.QuizImage

@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    sessionViewModel: SessionViewModel
) {

    val userName by sessionViewModel.userName.observeAsState("")

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
            onClick = {
                navController.navigate("FirstQuestionScreen")
            }
        )

    }
}