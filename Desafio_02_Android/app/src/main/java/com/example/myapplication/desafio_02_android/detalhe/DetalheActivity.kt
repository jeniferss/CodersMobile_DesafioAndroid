package com.example.myapplication.desafio_02_android.detalhe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.desafio_02_android.R

class DetalheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)

        val imagem = intent.getStringExtra("IMAGE")!!.toInt()
        val nome = intent.getStringExtra("NOME")


        findViewById<TextView>(R.id.tvNomeDetalhe).text = nome
        findViewById<ImageView>(R.id.imgDetalhe).setImageResource(imagem)
    }
}