package com.revature.mvvmcomposev1.data.network

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

object MovieApiClient {

    const val BASE_URL = "https://api.themoviedb.org/3/"

    private val retrofit=Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())

    val service:MovieFetchApi by lazy {

        Log.d("MovieApiClient","Service Init")
        retrofit.build().create(MovieFetchApi::class.java)
    }
}