package br.com.gamadeveloper.bronapp

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {

    //http://teste.weblayer.com.br/BrOnAPI/api/Vagas
    @GET("Vagas")
    fun getVAGA() : Call<List<VAGA>>

}