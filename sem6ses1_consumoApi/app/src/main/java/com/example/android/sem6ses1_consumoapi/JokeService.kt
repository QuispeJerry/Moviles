package com.example.android.sem6ses1_consumoapi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import java.text.Format

interface JokeService {
    @GET("api")
    fun getJoke(@Query("format") format: String): Call<Joke>
}