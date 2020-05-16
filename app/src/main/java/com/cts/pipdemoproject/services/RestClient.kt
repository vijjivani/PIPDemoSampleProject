package com.cts.pipdemoproject.services
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RestClient {

    private val BASE_URL ="https://api.stackexchange.com/"
    private var mRetrofit: Retrofit? = null


    val client: Retrofit
        get() {
            if (mRetrofit == null) {
                mRetrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return this.mRetrofit!!
        }


    private val BASE_URL_POST ="https://devslopes-chattin.herokuapp.com/v1/"
    private var mRetrofitPost: Retrofit? = null


    val clientpost: Retrofit
        get() {
            if (mRetrofitPost == null) {
                mRetrofitPost = Retrofit.Builder()
                    .baseUrl(BASE_URL_POST)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return this.mRetrofitPost!!
        }
}