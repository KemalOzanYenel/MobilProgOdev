package com.kemal.dev1.api

import com.kemal.dev1.api.ApiService

class ApiHelper(private val apiService: ApiService) {
    suspend fun getUsers() = apiService.getUsers()
}