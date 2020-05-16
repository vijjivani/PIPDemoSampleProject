package com.cts.pipdemoproject.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cts.pipdemoproject.R
import kotlinx.android.synthetic.main.food_orderlist_items.*
import java.util.*

class FoodDetailsActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_orderlist_items)

        val foodlist= arrayListOf("briyani","Aloo gobi","Aloo tikki","Aloo matar","Aloo methi")
        decidefoodbuttion.setOnClickListener {
            val random= Random()
            val randomFood=random.nextInt(foodlist.count())
            textView.text=foodlist[randomFood]
        }

        button.setOnClickListener {
            val newfood=addfoodtext.text.toString()
            foodlist.add(newfood)
            addfoodtext.text.clear()
            println(newfood)

        }
    }

}