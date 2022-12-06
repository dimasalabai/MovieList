package com.example.movielist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movielist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

//    private lateinit var imageUrl: String

    private lateinit var recycler: RecyclerView

    var listPoster: List<Poster> = listOf(
        Poster(
            "https://uakino.club/uploads/mini/poster/63/9c911dc5caf5e46d49948ff68bdd57.jpg",
            "8-бітне Pіздво",
            "Комедія , Фентезі , Сімейні"
        ),
        Poster(
            "https://uakino.club/uploads/mini/serial/44/131ef54593e054e5cb8f5f9480767e.jpg",
            "Периферійні пристрої",
            "Жахи, Ссеріали"
        ),
        Poster(
            "https://uakino.club/uploads/mini/poster/f9/44d38767c73cd559ef28bf4ebdffdf.jpg",
            "Моє ім'я Вендета",
            "Бойовик, Кримінал, Драма"
        ),
        Poster(
            "https://uakino.club/uploads/mini/poster/ec/5cfa3936797c3c0e624d97d5c02141.jpg",
            "Кімната 6",
            "Жахи, Трилер"
        ),
        Poster(
            "https://uakino.club/uploads/mini/poster/33/eb70babdd621d0baa45dd82faa4d63.jpg",
            "Райське місто",
            "Екшн, Трилер"
        ),
        Poster(
            "https://uakino.club/uploads/mini/poster/10/842f6ec00cfcb0ed15be2c20130567.jpg",
            "Чорний телефон",
            "Жахи, Трилер"
        )


    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
//        val view = binding.root
//        setContentView(view)
        intancias()
    }

    fun intancias() {
        recycler = binding.list
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = RecyclerMovie(this, listPoster)
    }


//    companion object {
//        const val KEY_IMAGE_URL = "KEY_IMAGE_URL" //Тимчасово
//
//        val imagesList = listOf(
//            "https://uakino.club/uploads/mini/poster/63/9c911dc5caf5e46d49948ff68bdd57.jpg", //8-бітне різдво
//            "https://uakino.club/uploads/mini/serial/44/131ef54593e054e5cb8f5f9480767e.jpg", //периферійні пристрої
//            "https://uakino.club/uploads/mini/poster/f9/44d38767c73cd559ef28bf4ebdffdf.jpg", //моє імя вендета
//            "https://uakino.club/uploads/mini/poster/ec/5cfa3936797c3c0e624d97d5c02141.jpg", //кімната 6
//            "https://uakino.club/uploads/mini/poster/33/eb70babdd621d0baa45dd82faa4d63.jpg", //райське місто
//            "https://uakino.club/uploads/mini/poster/10/842f6ec00cfcb0ed15be2c20130567.jpg" //чорний телефон
//        )
//    }


}