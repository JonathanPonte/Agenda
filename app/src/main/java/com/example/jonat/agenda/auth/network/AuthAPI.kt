package com.example.jonat.agenda.auth.network

import com.example.jonat.agenda.auth.module.User
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface AuthAPI {

     @POST("/auth")
     fun cadastrarUsuario(@Body usuario : User): Observable<ApiResponse>





}