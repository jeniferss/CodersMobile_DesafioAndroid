package com.example.myapplication.desafio_02_android.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.desafio_02_android.R
import com.example.myapplication.desafio_02_android.detalhe.DetalheActivity

class MenuActivity : AppCompatActivity() {

    val descricao = "Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto " +
            "Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto " +
            "Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto Texto "

    val listaPrato = arrayListOf(
        Prato("Salada com molho Gengibre", R.drawable.res_02, descricao),
        Prato("Salada com molho Gengibre", R.drawable.res_02, descricao),
        Prato("Salada com molho Gengibre", R.drawable.res_02, descricao),
        Prato("Salada com molho Gengibre", R.drawable.res_02, descricao),
        Prato("Salada com molho Gengibre", R.drawable.res_02, descricao),
        Prato("Salada com molho Gengibre", R.drawable.res_02, descricao),
        Prato("Salada com molho Gengibre", R.drawable.res_02, descricao),
        Prato("Salada com molho Gengibre", R.drawable.res_02, descricao),
        Prato("Salada com molho Gengibre", R.drawable.res_02, descricao),
        Prato("Salada com molho Gengibre", R.drawable.res_02, descricao),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        findViewById<TextView>(R.id.tvNomeMenu).text = intent.getStringExtra("NOME_RESTAURANTE")

        val image = intent.getIntExtra("IMAGE_RESTAURANTE", 0)
        findViewById<ImageView>(R.id.imgMenu).setImageResource(image)


        val viewManager = GridLayoutManager(this, 2)
        val recyclerView = findViewById<RecyclerView>(R.id.pratoLista)

        findViewById<ImageView>(R.id.btnVoltaMenu).setOnClickListener {
            finish()
        }

        val viewAdapter = PratoAdapter(listaPrato) {
            val intent = Intent(this, DetalheActivity::class.java)
            intent.putExtra("NOME", it.nomePrato)
            intent.putExtra("DESCRICAO", it.descricao)
            intent.putExtra("IMAGE_PRATO", it.imageIdPrato)
            startActivity(intent)
        }

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}


