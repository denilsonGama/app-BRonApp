package br.com.gamadeveloper.bronapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.com.gamadeveloper.bronapp.data.VagaModel
import br.com.gamadeveloper.bronapp.data.EmpresaModel


class AdapterVaga(private val myDataList: ArrayList<VagaModel>) : RecyclerView.Adapter<AdapterVaga.AdapterVagaHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterVagaHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_card_vaga, parent, false)
        return AdapterVagaHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterVagaHolder, position: Int) {
        holder.idVaga.text = myDataList[position].idVaga.toString()
        holder.descricao.text  = myDataList[position].descricao
        holder.criacao.text   = myDataList[position].criacao
        holder.status.text   = myDataList[position].status.toString()




    }

    override fun getItemCount(): Int {
        return myDataList.size
    }

    inner class AdapterVagaHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var idVaga: TextView
        internal var descricao: TextView
        internal var criacao: TextView
        internal var status: TextView



        init {
            idVaga = itemView.findViewById<View>(R.id.idVaga) as TextView
            descricao  = itemView.findViewById<View>(R.id.descricao)  as TextView
            criacao   = itemView.findViewById<View>(R.id.criacao)   as TextView
            status = itemView.findViewById<View>(R.id.status) as TextView



        }
    }
}