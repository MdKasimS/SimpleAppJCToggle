package com.mdkasims.jcsimpleapptoggle.models

import com.mdkasims.jcsimpleapptoggle.models.entities.OEM
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("/api/oems")
    suspend fun getOEMs(): List<OEM>
}

object RetrofitClient {
    private const val BASE_URL = "http://10.0.2.2:5000/"

    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}

