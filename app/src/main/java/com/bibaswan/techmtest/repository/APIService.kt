package com.bibaswan.techmtest.repository

import com.bibaswan.techmtest.model.PostInfo
import retrofit2.Call
import retrofit2.http.GET



interface APIService {

    @GET("posts")
    fun makeRequest(): Call<List<PostInfo>>
}