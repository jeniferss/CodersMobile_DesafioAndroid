package com.example.myapplication.desafio_02_android.menu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.desafio_02_android.R

class PratoAdapter(private val pratos: List<Prato>, private val listener: (Prato) -> Unit) :
    RecyclerView.Adapter<PratoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratoViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.prato_view, parent, false)
        return PratoViewHolder(view)
    }

    override fun onBindViewHolder(holder: PratoViewHolder, position: Int) {
        val item = pratos[position]
        holder.bind(item)

        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount() = pratos.size
}