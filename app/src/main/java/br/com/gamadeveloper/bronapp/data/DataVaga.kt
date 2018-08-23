package br.com.gamadeveloper.bronapp.data

import org.json.JSONArray

class DataVaga {

    companion object {

        //---------------------------------------------------------------------------
        open fun vagas() = JSONArray(
                """
                        [{"VagaId":1,"Descricao":"Analista Jr","Criacao":"10/08/2018","Status":1,"Empresa":1},
                        {"VagaId":2,"Descricao":"Desenhista","Criacao":"10/08/2018","Status":1,"Empresa":1},
                        {"VagaId":3,"Descricao":"Motorista","Criacao":"10/08/2018","Status":1,"Empresa":1},
                        {"VagaId":4,"Descricao":"Limpador","Criacao":"10/08/2018","Status":1,"Empresa":1},
                        {"VagaId":5,"Descricao":"Cabelereiro","Criacao":"10/08/2018","Status":1,"Empresa":1},
                        {"VagaId":6,"Descricao":"Assistente II","Criacao":"10/08/2018","Status":1,"Empresa":1},
                        {"VagaId":7,"Descricao":"Enfermeiro","Criacao":"10/08/2018","Status":1,"Empresa":1},
                        {"VagaId":8,"Descricao":"Medico","Criacao":"10/08/2018","Status":1,"Empresa":1}]
             """)
        //---------------------------------------------------------------------------

    }
}