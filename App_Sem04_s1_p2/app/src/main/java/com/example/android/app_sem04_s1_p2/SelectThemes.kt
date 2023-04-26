package com.example.android.app_sem04_s1_p2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

const val EXTRA_MESS = "com.example.android.app_sem04_s1_p2";
class SelectThemes : AppCompatActivity() {

    var number: String = "-1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_themes)

        findViewById<Button>(R.id.btnHistory).setOnClickListener {
            number = "1";
            enviarNumero(number);
        }
        findViewById<Button>(R.id.btnMath).setOnClickListener {
            number = "2";
            enviarNumero(number);
        }
        findViewById<Button>(R.id.btnPhisical).setOnClickListener {
            number = "3";
            enviarNumero(number);
        }
        findViewById<Button>(R.id.btnRandom).setOnClickListener {
            enviarNumero(number);
        }
    }


    fun enviarNumero(a: String){
        val intent = Intent(this, MainActivity::class.java).apply{
            putExtra(EXTRA_MESS, a);
        }
        startActivity(intent);
    }

}