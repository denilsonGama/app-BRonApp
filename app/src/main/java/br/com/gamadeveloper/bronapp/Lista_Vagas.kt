package br.com.gamadeveloper.bronapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Lista_Vagas : AppCompatActivity() {

    //-- Declaração dos objetos que serão vinculados
    //-- com o layout "lista_vagas.xml    lateinit var PesquisarVAGA: Button
    lateinit var barraProgresso: ProgressBar
    lateinit var pesquisarVagas: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista_vagas)

        //-- Vinculação
        pesquisarVagas    = findViewById(R.id.pesquisarVAGA)
        barraProgresso  = findViewById(R.id.progress_bar)

        //-- Ao clicar no botão, serão pesquisadas as vagas
        pesquisarVagas.setOnClickListener {

            barraProgresso.visibility = View.VISIBLE

            val call = RetrofitFactory().retrofitService().getVAGA()

            call.enqueue(object : Callback<List<VAGA>> {

                override fun onResponse(call: Call<List<VAGA>>, response: Response<List<VAGA>>) {

                    response.let {
                        val coletaVAGA: List<VAGA>? = it.body()
                        Log.i("VAGA", coletaVAGA?.toString())
                        Toast.makeText(this@Lista_Vagas, coletaVAGA.toString(), Toast.LENGTH_LONG).show()
                        barraProgresso.visibility = View.INVISIBLE
                    }
                }

                override fun onFailure(call: Call<List<VAGA>>?, t: Throwable?) {
                    Log.e("Erro", t?.message)
                    barraProgresso.visibility = View.INVISIBLE
                }
            })
        }
    }
}