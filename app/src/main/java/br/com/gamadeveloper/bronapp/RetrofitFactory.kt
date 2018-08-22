package br.com.gamadeveloper.bronapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    val URL: String = "http://teste.weblayer.com.br/BrOnAPI/api/"

    val retrofitFactory = Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun retrofitService(): RetrofitService {
        return retrofitFactory.create(RetrofitService::class.java)
    }
}