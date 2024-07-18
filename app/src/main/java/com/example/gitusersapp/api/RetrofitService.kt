package com.example.gitusersapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    companion object {
        private const val BASE_URL = "https://api.github.com"

        fun provideRetrofit(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        fun <T> createService(
            retrofit: Retrofit,
            interfaceClazz: Class<T>
        ): T {
            return retrofit.create(interfaceClazz)
        }
    }
}