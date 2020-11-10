package com.example.myapplication.desafio_02_android

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RestauranteAdapter(private val restaurantes:List<Restaurante>):
    RecyclerView.Adapter<RestauranteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.restaurante_view, parent,false)
        return RestauranteViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {
        holder.bind(restaurantes[position])
    }

    override fun getItemCount() = restaurantes.size
}

