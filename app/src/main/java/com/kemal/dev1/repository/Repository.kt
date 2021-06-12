package com.kemal.dev1.repository

import com.kemal.dev1.api.RetroFitBuilder

class Repository {
    suspend fun getUsers() = RetroFitBuilder.api.getUsers()
}