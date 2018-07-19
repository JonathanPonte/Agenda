package com.example.jonat.agenda.auth.module

import com.google.gson.annotations.SerializedName

open class User{

    var email : String? = ""

    var password : String? = ""

    @SerializedName("password_Confirmation")
    var passwordConfirmation : String? = ""



    var uid : String? = ""

    var client : String? = ""

    @SerializedName("acess-token")
    var acessToken : String? = ""

}