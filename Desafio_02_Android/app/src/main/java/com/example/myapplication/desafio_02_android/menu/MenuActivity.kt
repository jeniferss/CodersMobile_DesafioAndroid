package com.example.myapplication.desafio_02_android.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.desafio_02_android.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val listaPrato = arrayListOf(
            Prato("AB", R.drawable.res_01),
            Prato("CD", R.drawable.res_02)
        )

        val viewManager = GridLayoutManager(this, 2)
        val recyclerView = findViewById<RecyclerView>(R.id.pratoLista)

        val viewAdapter = PratoAdapter(listaPrato){
            val viewAdapter = PratoAdapter(listaPrato) {
                val intent = Intent(this, MenuActivity::class.java)
                intent.putExtra("NOME", it.nomePrato)
                intent.putExtra("IMAGE", it.imageIdPrato)
                startActivity(intent)
            }

            recyclerView.apply {
                setHasFixedSize(true)
                layoutManager = viewManager
                adapter = viewAdapter
            }
        }
        }
    }
