package com.kemal.dev1.api

import com.kemal.dev1.model.User
import retrofit2.Response
import retrofit2.http.GET


interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<MutableList<User>>
}