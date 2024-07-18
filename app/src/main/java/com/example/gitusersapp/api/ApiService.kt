package com.example.gitusersapp.api

import com.example.gitusersapp.model.GitUserResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("/users")
    suspend fun getGitUsers(
        @Query("since") since: Int = 0
    ): Response<ArrayList<GitUserResponse>>

    @GET("/users/{username}")
    suspend fun getGitUserNyUsername(
        @Path("username") username: String = ""
    ): Response<GitUserResponse>
}