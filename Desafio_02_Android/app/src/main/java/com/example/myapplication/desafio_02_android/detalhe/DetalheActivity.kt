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

        val nome = intent.getStringExtra("NOME")
        val descricao = intent.getStringExtra("DESCRICAO")


        findViewById<TextView>(R.id.tvNomeDetalhe).text = nome
        findViewById<TextView>(R.id.tvDescricao).text = descricao

        findViewById<ImageView>(R.id.btnVoltaDetalhe).setOnClickListener {
            finish()
        }
    }
}