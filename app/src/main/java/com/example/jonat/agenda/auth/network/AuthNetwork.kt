package com.example.jonat.agenda.auth.network

import android.util.Log
import com.example.jonat.agenda.auth.module.User
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object AuthNetwork {

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    val authAPI by lazy {

        getRetrofit().create(AuthAPI::class.java)

    }


    fun cadastrarUsuario(user : User, onSuccess: (user : User) -> Unit, onError: () -> Unit){


        authAPI.cadastrarUsuario(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ user ->
                    //se tudo deu certo
                    user?.let {

                        Log.d("tag", "Deu certooooooooooOOOOOO, ${user.email}")
                        onSuccess(it)

                    }

                },{
                    Log.d("tag", "Deu ruim, ${user.email}")
                    onError()
                })

    }





}