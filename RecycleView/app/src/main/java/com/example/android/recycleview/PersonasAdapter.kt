package com.example.android.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonasAdapter(var personas: ArrayList<Persona>): RecyclerView.Adapter<PersonaPrototype>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaPrototype {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.prototype_recycle,parent, false)

        return PersonaPrototype(view)
    }

    override fun onBindViewHolder(holder: PersonaPrototype, position: Int) {
        holder.bind(personas.get(position))
    }

    override fun getItemCount(): Int {
        return personas.size
    }

}

class PersonaPrototype(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvName= itemView.findViewById<TextView>(R.id.tvName)
    val tvApellido= itemView.findViewById<TextView>(R.id.tvApellido)

    fun bind(persona: Persona){
        tvName.text= persona.nombre
        tvApellido.text=persona.apellido
    }
}
