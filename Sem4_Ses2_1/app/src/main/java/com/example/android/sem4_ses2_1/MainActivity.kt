package com.example.android.sem4_ses2_1

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

//5
val CAMERA_REQUEST_CODE = 0;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btinit = findViewById<Button>(R.id.btnPermiso)//1

        //2
        btinit.setOnClickListener {
            checkCameraPermission()
        }
    }

    //5
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode){
            CAMERA_REQUEST_CODE -> {
                if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this, "Se acepto el permiso de la CAMARA", Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"Permiso denegneado", Toast.LENGTH_LONG).show()
                }
                return
            }
        }
    }

    //3
    private fun checkCameraPermission() {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED){
            resquestCamerPermisssion()
        }
        else{
            Toast.makeText(this, "Ya se tiene el permiso de la camara", Toast.LENGTH_LONG).show();
        }
    }

    //4
    private fun resquestCamerPermisssion() {
        //solicitamos el permiso
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.CAMERA)){
            Toast.makeText(this, "Rechazó el permiso antes. Habilitelo!", Toast.LENGTH_LONG).show();
        }
        else{
            //el usuario nunca pidió el permiso
            Toast.makeText(this, "Debe aceptar el permiso", Toast.LENGTH_LONG).show();
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA), CAMERA_REQUEST_CODE);
        }
    }
}