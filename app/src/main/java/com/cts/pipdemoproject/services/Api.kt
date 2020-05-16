package com.cts.pipdemoproject.services

import com.cts.pipdemoproject.model.LoginRequest
import com.cts.pipdemoproject.model.LoginResponse
import com.cts.pipdemoproject.model.QuestionList
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.Url




interface Api {

    @GET("/2.2/questions?order=desc&sort=creation&site=stackoverflow")    //End Url
    fun fetchQuestions(@Query("tagged") tags: String): Call<QuestionList>


   @POST("/account/login")
   fun getUsers(@Body request:LoginRequest): Call<LoginResponse>


}