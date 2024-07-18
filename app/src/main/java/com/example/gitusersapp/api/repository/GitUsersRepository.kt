package com.example.gitusersapp.api.repository

import com.example.gitusersapp.api.ApiService
import com.example.gitusersapp.model.GitUserResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response

class GitUsersRepository (private val apiService: ApiService) {
    suspend fun getGitUsers(since: Int): Flow<Response<ArrayList<GitUserResponse>>> {
        return flow {
            emit(apiService.getGitUsers(since))
        }.flowOn(Dispatchers.IO)
    }
    suspend fun getGitUserByUsername(username: String): Flow<Response<GitUserResponse>> {
        return flow {
            emit(apiService.getGitUserNyUsername(username))
        }.flowOn(Dispatchers.IO)
    }
}