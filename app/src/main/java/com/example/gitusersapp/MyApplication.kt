package com.example.gitusersapp

import android.app.Application
import com.example.gitusersapp.di.allModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication: Application() {
    companion object {
        lateinit var instance: MyApplication
    }

    fun getInstance(): MyApplication {
        return instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@MyApplication)
            androidLogger(Level.ERROR)
            modules(allModules)
        }
    }
}