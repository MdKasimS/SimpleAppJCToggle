package com.mdkasims.jcsimpleapptoggle.views

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mdkasims.jcsimpleapptoggle.viewmodels.CarListViewModel
import androidx.compose.foundation.lazy.items

@Composable
fun OemList(viewModel: CarListViewModel = viewModel())
{
    val oemList = viewModel.oems

    Log.d("Data Received", oemList.toString())
    if(oemList.size!=0)
    {
    LazyColumn {

            items(oemList, key = { it.id }) { oem ->
                Text(text = "OEM ID: ${oem.id} | ${oem.name}")
            }
        }

    }else
    {
        Text(text = "No Elements To Show!")
    }


}

