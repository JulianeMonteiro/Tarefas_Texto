package com.juliane.tarefas_texto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class TextoAdapter(var listaTarefas: MutableList<Texto>):RecyclerView.Adapter<TextoAdapter.ItemViewHolder>() {
    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgFoto: ImageView = view.findViewById(R.id.imgFoto)
        val txtTitulo: TextView = view.findViewById(R.id.txtTitulo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_texto, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        listaTarefas[position].foto?.let{
            holder.imgFoto.setImageDrawable(it)
        }
        holder.txtTitulo.text = listaTarefas[position].titulo
    }

    override fun getItemCount(): Int {
        return listaTarefas.size
    }
}