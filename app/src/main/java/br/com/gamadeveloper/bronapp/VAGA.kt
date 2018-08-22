package br.com.gamadeveloper.bronapp

import com.google.gson.annotations.SerializedName

data class VAGA (

        @SerializedName("VagaId")           val vagaid: Int,
        @SerializedName("Descricao")        val descricao: String,
        @SerializedName("Criacao")          val criacao: String,
        @SerializedName("Status")           val status: String,
        @SerializedName("EmpresaId")        val empresaid: String

)