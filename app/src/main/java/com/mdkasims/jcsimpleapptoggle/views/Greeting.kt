package com.mdkasims.jcsimpleapptoggle.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, navController: NavController) {

    Column(verticalArrangement = Arrangement.SpaceEvenly)
    {
        Box(contentAlignment = Alignment.TopStart,
            modifier = Modifier
                    .padding(16.dp))

        {
            Text(
                text = "Assalamualaikum $name!",
                modifier = modifier
            )
        }

        Box( modifier = Modifier
            .padding(16.dp))
        {
            Button( onClick = {navController.navigate("oemlist")} )
            {
                Text(
                    text = "Show Me All OEMs",
                    modifier = modifier
                )
            }
        }

        Box( modifier = Modifier
            .padding(16.dp))
        {
            Button( onClick = {navController.navigate("carlist")} )
            {
                Text(
                    text = "Show Me All Cars",
                    modifier = modifier
                )
            }
        }

        Box( modifier = Modifier
            .padding(16.dp))
        {
            Button( onClick = {navController.navigate("oemdatalist")} )
            {
                Text(
                    text = "Show Me All Oem Collected Data",
                    modifier = modifier
                )
            }
        }
    }

}