package com.example.myapplication.desafio_02_android.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.desafio_02_android.R
import com.example.myapplication.desafio_02_android.menu.MenuActivity

class HomeActivity : AppCompatActivity() {

    val listaRestaurante = arrayListOf(
        Restaurante(
            "Tony Roma's",
            "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            "Fecha às 22:00",
            R.drawable.res_01
        ),
        Restaurante(
            "Aoyama - Moema",
            "Alameda das Anarapés, 532 - Moema",
            "Fecha às 00:00",
            R.drawable.res_02
        ),
        Restaurante(
            "Outback - Moema",
            "Av. Moaci, 187 - Moema, São Paulo",
            "Fecha às 00:00",
            R.drawable.res_03
        ),
        Restaurante(
            "Sí Señor!",
            "Alameda Jauaperi, 626 - Moema",
            "Fecha às 01:00",
            R.drawable.res_04
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val viewManager = LinearLayoutManager(this)
        val recyclerView = findViewById<RecyclerView>(R.id.listaRestaurante)

        val viewAdapter = RestauranteAdapter(listaRestaurante) {
            val intent = Intent(this, MenuActivity::class.java)
            intent.putExtra("NOME_RESTAURANTE", it.nome)
            intent.putExtra("IMAGE_RESTAURANTE", it.imageId)
            startActivity(intent)
        }

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}