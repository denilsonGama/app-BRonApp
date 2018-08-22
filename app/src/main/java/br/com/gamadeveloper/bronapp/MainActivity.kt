package br.com.gamadeveloper.bronapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.page_login.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_login)
    }

    fun buttonLogin(view: View) {

        val email = edit_Email
        val senha = edit_Senha


        if (edit_Email.length() == 0) {

            textError.setText("Todos os campos obrigatorio!")

        } else if (edit_Senha.length() == 0) {

            textError.setText("Todos os campos obrigatorio!")

        } else {
            val intent = Intent(this, lista_vagas::class.java)

            startActivity(intent)
        }

    }
}