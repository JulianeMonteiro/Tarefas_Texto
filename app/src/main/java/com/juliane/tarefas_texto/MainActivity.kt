package com.juliane.tarefas_texto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rvUsuarios)

        val lista = mutableListOf<Texto>(
            Texto(titulo = "Dentista as 9h no sábado.", foto = resources.getDrawable(R.drawable.lista)),
            Texto(titulo = "Não esquecer: Beber água!", foto = resources.getDrawable(R.drawable.lista)),
            Texto(titulo = "Comprar leite e ovos.", foto = resources.getDrawable(R.drawable.lista)),
            Texto(titulo = "Pagar contas de internet e luz.", foto = resources.getDrawable(R.drawable.lista)),
            Texto(titulo = "Estudar para a prova", foto = resources.getDrawable(R.drawable.lista)),


            )

        rv.adapter = TextoAdapter(lista)

        rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

    }
}