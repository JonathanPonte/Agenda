package com.example.jonat.agenda.auth.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.util.Log
import com.example.jonat.agenda.R
import com.example.jonat.agenda.auth.business.AuthBusiness
import com.example.jonat.agenda.auth.module.User
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        Realm.init(this)


        configuraBotaoCadastrar()
    }

    private fun configuraBotaoCadastrar() {


        botaoCadastrar.setOnClickListener {
        AuthBusiness.cadastrarUsuario(editTextEmail.text.toString(), editTextSenha.text.toString(),{

            Snackbar.make(it, "Usuario cadastrado com sucesso!", Snackbar.LENGTH_SHORT).show()

        }, {

            Snackbar.make(it, "Usuario já existe!", Snackbar.LENGTH_SHORT).show()


        })



        }
    }


}
