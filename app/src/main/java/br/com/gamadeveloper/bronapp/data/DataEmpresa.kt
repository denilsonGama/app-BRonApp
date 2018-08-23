package br.com.gamadeveloper.bronapp.data

import org.json.JSONArray

class DataEmpresa {

    companion object {

        //---------------------------------------------------------------------------
        open fun Empresas() = JSONArray(
                """
                    [{"IdEmpresa":1,"Razao Social":"BR-On","Email":"bron@bron.com","CNPJ":00.000./0001-00;"Porte:1}
""")
//---------------------------------------------------------------------------

    }
}