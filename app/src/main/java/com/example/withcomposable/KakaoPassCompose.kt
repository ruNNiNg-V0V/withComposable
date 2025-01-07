package com.example.withcomposable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun kakaoPassCompose(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            text = stringResource(id = R.string.main_desc),
            fontSize = 17.sp
        )
        Text(
            text = "kkang104@gmail.com",
            color = Color(0xFFCFCDCF)
        )
        Spacer(modifier = Modifier
            .height(1.dp)
            .fillMaxWidth()
            .background(Color(0xFFD4DFD3))
        )
        val password = remember { mutableStateOf("") }
        BasicTextField(
            value = password.value,
            onValueChange = { password.value = it },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation(),
            decorationBox = { innerTextField ->
                if (password.value.isEmpty()) {
                    Text("비밀번호")
                }
                innerTextField()
            }
        )
        Text(
            text = stringResource(id = R.string.password_txt),
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("확인")
        }
    }
}
