package com.example.movielist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class Detail : AppCompatActivity() {

    lateinit var image:ImageView
    lateinit var img:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        instansias()

        img = intent.getStringExtra("image").toString()
        Glide.with(this).load(img).into(image)
    }

    private fun instansias() {
        image = findViewById(R.id.imageDetail)
    }


}