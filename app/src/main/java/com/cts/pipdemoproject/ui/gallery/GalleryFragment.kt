package com.cts.pipdemoproject.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.cts.pipdemoproject.R
import kotlinx.android.synthetic.main.fragment_gallery.*
import java.util.*

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
            ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val decidefoodbuttion: TextView = root.findViewById(R.id.decidefoodbuttion)
        val button: TextView = root.findViewById(R.id.button)
      /*  galleryViewModel.text.observe(this, Observer {
            textView.text = it
        })*/

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
        return root
    }
}