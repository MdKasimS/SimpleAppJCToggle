package com.mdkasims.jcsimpleapptoggle.views

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mdkasims.jcsimpleapptoggle.viewmodels.CarListViewModel
import androidx.compose.foundation.lazy.items

@Composable
fun CarList(viewModel: CarListViewModel = viewModel())
{
    val oemList = viewModel.oems

    Log.d("Data Received", oemList.toString())

    LazyColumn {
        items(oemList, key = { it.id }) { oem ->
            Text(text = "OEM ID: ${oem.id} | ${oem.name}")
        }
    }


}

