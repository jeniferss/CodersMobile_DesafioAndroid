package com.example.myapplication.desafio_02_android.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.desafio_02_android.R


class RestauranteAdapter(
    private val restaurantes: List<Restaurante>,
    private val listenerH: (Restaurante) -> Unit
) :
    RecyclerView.Adapter<RestauranteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.restaurante_item, parent, false)
        return RestauranteViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {
        val item = restaurantes[position]
        holder.bind(item)

        holder.itemView.setOnClickListener { listenerH(item) }
    }

    override fun getItemCount() = restaurantes.size
}

