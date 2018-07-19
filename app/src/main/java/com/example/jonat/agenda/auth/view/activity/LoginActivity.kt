package com.example.jonat.agenda.auth.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.jonat.agenda.R
import com.example.jonat.agenda.auth.business.AuthBusiness
import com.example.jonat.agenda.auth.module.User
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        configuraBotaoCadastrar()
    }

    private fun configuraBotaoCadastrar() {

        botaoCadastrar.setOnClickListener {



        AuthBusiness.cadastrarUsuario(editTextEmail.text.toString(), editTextSenha.text.toString(),{

        }, {

        })



        }
    }


}
