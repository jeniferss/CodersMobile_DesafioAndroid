package com.example.myapplication.desafio_02_android.home

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.desafio_02_android.R

class RestauranteViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    private val nomeRestaurante = view.findViewById<TextView>(R.id.tvNomeRestaurante)
    private val enderecoRestaurante = view.findViewById<TextView>(R.id.tvEndereco)
    private val horarioRestaurante = view.findViewById<TextView>(R.id.tvHorarioFechamento)
    private val imageRestaurante = view.findViewById<ImageView>(R.id.imgRestaurante)

    fun bind(restaurante: Restaurante) {
        nomeRestaurante.text = restaurante.nome
        enderecoRestaurante.text = restaurante.endereco
        horarioRestaurante.text = restaurante.horario
        imageRestaurante.setImageResource(restaurante.imageId)
    }
}

