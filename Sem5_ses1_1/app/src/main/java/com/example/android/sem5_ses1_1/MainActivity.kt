package com.example.android.sem5_ses1_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var contacts = ArrayList<Contact>();//1

    //creamos el adapter
    var contactAdapter = ContactAdapter(contacts)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadContacts()//3
        initView()
    }

    private fun initView() {
        val rvContact = findViewById<RecyclerView>(R.id.rvContact)

        rvContact.adapter = contactAdapter
        rvContact.layoutManager = LinearLayoutManager(this);
    }

    //2
    private fun loadContacts(){
        contacts.add(Contact("Americo","12457368"))
        contacts.add(Contact("F de Fer","213546879"))
        contacts.add(Contact("jihsdsjkidjk","7531598426"))
    }
}