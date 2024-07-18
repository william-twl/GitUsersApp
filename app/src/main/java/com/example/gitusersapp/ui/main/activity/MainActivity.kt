package com.example.gitusersapp.ui.main.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitusersapp.R
import com.example.gitusersapp.ui.main.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}