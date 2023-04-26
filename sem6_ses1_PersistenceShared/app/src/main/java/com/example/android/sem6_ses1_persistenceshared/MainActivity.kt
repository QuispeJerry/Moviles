package com.example.android.sem6_ses1_persistenceshared

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<TextInputEditText>(R.id.etText)
        val sharedPreferences = SharedPreference(this)

        val btnSave = findViewById<Button>(R.id.btnSave)
        btnSave.setOnClickListener {
            val name = etName.text.toString()

            sharedPreferences.save("name",name)

            Toast.makeText(this, "Data Stored", Toast.LENGTH_LONG).show()
        }

        val tvRetrie = findViewById<TextView>(R.id.tvName2)
        val btnRetri = findViewById<Button>(R.id.btnGrabar2)
        btnRetri.setOnClickListener {
            if (sharedPreferences.getValue("name")!=null){
                tvRetrie.setText(sharedPreferences.getValue("name"))
            }
        }
    }
}