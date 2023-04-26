package com.empresa.helloword

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //El componente "text" es de tipo composable
            //Text(text = "Vamos a olvidar a Angie")
            personalData(name = "Jerry")
        }
    }

    @Composable
    private fun personalData(name: String){
        Text(text = "Yo $name, voy a olvidarte Angie")
        Column() {
            Text(text = "Yo $name, voy a olvidarte Angie")
            Text(text = "Ya verás, solo espera")
        }
    }

    @Preview
    @Composable
    fun previewPersonalData(){
        personalData(name = "Jerry")
    }
}


