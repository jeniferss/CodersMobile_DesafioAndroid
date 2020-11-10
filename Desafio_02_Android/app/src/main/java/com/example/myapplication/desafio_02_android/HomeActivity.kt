package com.example.myapplication.desafio_02_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val viewManager = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.resturanteLista)
        val viewAdapter = RestauranteAdapter(arrayListOf(
            Restaurante("AB", "ABABAB", "ABABABAB", R.drawable.splash_screen),
            Restaurante("CD", "CDCD", "CDCDCD", R.drawable.splash_screen)))

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}