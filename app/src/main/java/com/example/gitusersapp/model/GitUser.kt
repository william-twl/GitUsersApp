package com.example.gitusersapp.model

import com.google.gson.annotations.SerializedName

data class GitUserResponse(
    val id: Int? = 0,
    @SerializedName("login")
    val username: String? = "",
    val type: String? = "",
    @SerializedName("site_admin")
    val siteAdmin: Boolean = false
)
