package com.example.jonat.agenda.auth.database

import com.example.jonat.agenda.auth.module.User
import io.realm.Realm

object AuthDatabase {

    fun salvarUsuario(user : User, onSuccess: () -> Unit){

        Realm.getDefaultInstance().use { realm ->

            realm.beginTransaction()
            realm.copyToRealm(user)
            realm.commitTransaction()
            onSuccess()

        }

    }


}