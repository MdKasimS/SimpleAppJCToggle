package com.mdkasims.jcsimpleapptoggle.viewmodels

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mdkasims.jcsimpleapptoggle.models.RetrofitClient
import com.mdkasims.jcsimpleapptoggle.models.entities.OEM
import kotlinx.coroutines.launch


class CarListViewModel: ViewModel() {
    var oems by mutableStateOf<List<OEM>>(emptyList())
        private set

    var isLoading by mutableStateOf(false)
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    init {
        fetchOEMs()
    }

    private fun fetchOEMs() {
        viewModelScope.launch {
            isLoading = true
            errorMessage = null
            try {
                oems = RetrofitClient.apiService.getOEMs()
                Log.d("Data Received In ViewModel", oems.toString())
            } catch (e: Exception) {
                errorMessage = "Failed to fetch OEMs: ${e.message}"
                Log.e("CarListViewModel", "Error fetching data", e)
            } finally {
                isLoading = false
            }
        }
    }


}

//try {
//    val oems = RetrofitClient.apiService.getOEMs()
//    _oemList.value = oems
//} catch (e: Exception) {
//    // Handle errors
//}
