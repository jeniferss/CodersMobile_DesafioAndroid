package com.example.myapplication.desafio_02_android.menu

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.desafio_02_android.R

class PratoViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    private val nomePrato = view.findViewById<TextView>(R.id.tvNomePrato)
    private val imagePrato = view.findViewById<ImageView>(R.id.imgPrato)

    fun bind(prato: Prato) {
        nomePrato.text = prato.nomePrato
        imagePrato.setImageResource(prato.imageIdPrato)
    }
}