package com.cts.pipdemoproject.controller


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cts.pipdemoproject.R
import com.cts.pipdemoproject.UserDetails.view.MainActivity
import kotlinx.android.synthetic.main.foof_items.*

class ProjectClassDetails : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.foof_items)
        userDetails.setOnClickListener {
            val i= Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        foodItems.setOnClickListener {
            val i= Intent(this,FoodDetailsActivity::class.java)
            startActivity(i)
        }
        color.setOnClickListener {
            val i= Intent(this,GalleryImageActivity::class.java)
            startActivity(i)
        }

        constraint.setOnClickListener {
            val i= Intent(this,ConstraintActivity::class.java)
            startActivity(i)

        }


    }
}