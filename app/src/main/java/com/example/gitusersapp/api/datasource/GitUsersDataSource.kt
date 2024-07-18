package com.example.gitusersapp.api.datasource

import androidx.paging.ItemKeyedDataSource
import com.example.gitusersapp.api.ApiService
import com.example.gitusersapp.api.RetrofitService
import com.example.gitusersapp.model.GitUserResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GitUsersDataSource(private val scope: CoroutineScope): ItemKeyedDataSource<Int, GitUserResponse>() {
    private val apiService = RetrofitService.createService(RetrofitService.provideRetrofit(), ApiService::class.java)

    override fun getKey(item: GitUserResponse): Int {
        return item.id ?: 0
    }

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<GitUserResponse>
    ) {
        scope.launch(Dispatchers.IO) {
            val response = apiService.getGitUsers(params.requestedInitialKey ?: 0)
            when {
                response.isSuccessful -> {

                }
            }
        }
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<GitUserResponse>) {
        TODO("Not yet implemented")
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<GitUserResponse>) {
        TODO("Not yet implemented")
    }
}
