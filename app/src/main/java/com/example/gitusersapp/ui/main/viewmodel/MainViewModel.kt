package com.example.gitusersapp.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import com.example.gitusersapp.api.repository.GitUsersRepository

class MainViewModel(
    private val gitUsersRepository: GitUsersRepository
): ViewModel() {
    companion object {

    }
}