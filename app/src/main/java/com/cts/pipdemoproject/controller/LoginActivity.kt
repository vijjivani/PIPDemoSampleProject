package com.cts.pipdemoproject.controller

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.cts.pipdemoproject.R
import com.cts.pipdemoproject.UserDetails.view.MainActivity
import com.cts.pipdemoproject.model.LoginRequest
import com.cts.pipdemoproject.model.LoginResponse
import com.cts.pipdemoproject.model.QuestionList
import com.cts.pipdemoproject.services.Api
import com.cts.pipdemoproject.services.RestClient
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response





class

LoginActivity : AppCompatActivity(){
    private  var mApiservice: Api?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.cts.pipdemoproject.R.layout.activity_login)
        mApiservice = RestClient.client.create(Api::class.java)


        // set on-click listener
        loginLoginBtn.setOnClickListener {
            val email = loginEmailTxt.text.toString().trim();
            val password = loginPasswordText.text.toString().trim();

            if (email.isEmpty()) {
                loginEmailTxt.error = "Email required"
                loginEmailTxt.requestFocus()

            }else if (password.isEmpty()) {
                loginEmailTxt.error = "Password required"
                loginEmailTxt.requestFocus()

            }else {
                getUsers()
            }

        }
    }
        fun getUsers() {
            val service = RestClient.clientpost.create(Api::class.java)

            val call = service.getUsers(
                LoginRequest(email = "g@g.com", password = "123456")
            )

            call.enqueue(object : Callback<LoginResponse> {

                override fun onFailure(call: Call<LoginResponse>?, t: Throwable?) {
                    Log.v("TAG", "failure")

                }


                override fun onResponse(
                    call: Call<LoginResponse>?,
                    response: Response<LoginResponse>?
                ) {

                    val i = Intent(this@LoginActivity, ProjectClassDetails::class.java)
                    startActivity(i)
                    Log.v("TAG", "sai")

                }

            })
        }
}