package com.example.arnassmicius.retrofit.api.service

import com.example.arnassmicius.retrofit.api.model.GitHubRepo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by arnas on 18.2.16.
 */

interface GitHubClient {

    @GET("/users/{user}/repos")
    fun reposForUser(@Path("user") user: String): Call<List<GitHubRepo>>
}
