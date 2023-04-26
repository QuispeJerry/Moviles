package com.example.android.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var personas= ArrayList<Persona>();

    var personasAdapter = PersonasAdapter(personas)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cargarPersonas()
        initView()
    }

    private fun initView() {
        val rvPersona = findViewById<RecyclerView>(R.id.rvPersona)

        rvPersona.adapter = personasAdapter
        rvPersona.layoutManager = LinearLayoutManager(this)
    }

    private fun cargarPersonas() {
        personas.add(Persona("Jerry", "Quispe"))
        personas.add(Persona("Gavilan", "Alisson"))
        personas.add(Persona("Aydee", "Acevedo"))
        personas.add(Persona("Benja", "Quispe"))
    }
}