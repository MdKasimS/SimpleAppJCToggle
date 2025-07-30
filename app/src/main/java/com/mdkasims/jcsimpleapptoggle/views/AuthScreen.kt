package com.mdkasims.jcsimpleapptoggle.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mdkasims.jcsimpleapptoggle.ui.theme.JCSimpleAppToggleTheme

@Composable
fun AuthScreen()
{
    var text by remember { mutableStateOf("") }
    JCSimpleAppToggleTheme {
//        Row(modifier = Modifier.fillMaxWidth()) {
//            Box(
//                modifier = Modifier
//                    .weight(1f)
//                    .fillMaxHeight()
//                    .background(Color.Red)
//            ){
//                Text(text="Assalamualaikum Android!",
//                    color = Color.White,
//                    fontSize = 25.sp)
//            }
//            Box(
//                modifier = Modifier
//                    .weight(1f)
//                    .fillMaxHeight()
//                    .background(Color.Blue)
//            ){
//                Text(text="Welcome To The Car Shop!",
//                    color = Color.White,
//                    fontSize = 25.sp)
//            }
//        }

        Column(modifier = Modifier.fillMaxHeight())
        {
            Box(modifier = Modifier
                            .weight(1f)
                            .background(Color.Red)
                            .fillMaxWidth())
            {
                Text(text="Assalamualaikum Android", color = Color.White, fontSize = 25.sp)

            }
            Box(modifier = Modifier
                .weight(1f)
                .background(Color.Blue)
                .fillMaxWidth())
            {
                Text(text="Welcome To The Car Shop", color = Color.White, fontSize = 25.sp)

            TextField(
                value = text,
                onValueChange = { text = it },
                placeholder = { Text(text = "Enter your name...") },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .align(Alignment.BottomCenter)
            )
        }
        }

    }
}
