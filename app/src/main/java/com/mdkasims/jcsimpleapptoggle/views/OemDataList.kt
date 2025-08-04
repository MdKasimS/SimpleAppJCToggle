package com.mdkasims.jcsimpleapptoggle.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.mdkasims.jcsimpleapptoggle.models.dtos.OemDto

@Composable
fun OemDataList(viewModel :CarListViewModel = CarShopViewModel())
{
    val oems by viewModel.oemList.collectAsState()

    Column {
        oems.forEach { oem ->
            Text(text = "${oem.name}")
        }

        Button(onClick = {
            viewModel.addOEM(OemDto(id=30,name = "Hennesey"))
        }) {
            Text("Add OEM")
        }

        Button(onClick = { viewModel.clearOEMs() }) {
            Text("Clear OEMs")
        }
    }

}