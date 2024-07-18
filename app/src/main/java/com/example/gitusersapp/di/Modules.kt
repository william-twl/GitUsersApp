package com.example.gitusersapp.di

import com.example.gitusersapp.api.ApiService
import com.example.gitusersapp.api.RetrofitService
import com.example.gitusersapp.api.repository.GitUsersRepository
import com.example.gitusersapp.ui.main.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val apiModule = module {
    single { RetrofitService.createService(get(), ApiService::class.java) }
}

val repositoryModule = module {
    single { RetrofitService.provideRetrofit() }

    single { GitUsersRepository(get()) }
}

val appModule = module {

}

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}

val allModules = listOf(apiModule, repositoryModule, appModule, viewModelModule)