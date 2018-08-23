package br.com.gamadeveloper.bronapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import br.com.gamadeveloper.bronapp.data.DataVaga
import br.com.gamadeveloper.bronapp.data.VagaModel
import br.com.gamadeveloper.bronapp.data.EmpresaModel
import org.json.JSONArray
import org.json.JSONObject

class ListaVagas : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var viewAdapter: RecyclerView.Adapter<*>? = null
    var listOfVagas: ArrayList<VagaModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista_vagas)

        var jsonArray: JSONArray = DataVaga.vagas()


        for (item in 0..(jsonArray.length()-1)){

            var jsonObject: JSONObject = jsonArray.getJSONObject(item)

            val vaga = VagaModel()

            vaga.idVaga = jsonObject.getInt("VagaId")
            vaga.descricao = jsonObject.getString("Descricao")
            vaga.criacao = jsonObject.getString("Criacao")
            vaga.status = jsonObject.getInt("Status")



            listOfVagas.add(vaga)
        }

        recyclerView = findViewById(R.id.recycler_view)

        var mLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView!!.layoutManager = mLayoutManager

        viewAdapter = AdapterVaga(listOfVagas)
        recyclerView!!.adapter = viewAdapter

    }
}