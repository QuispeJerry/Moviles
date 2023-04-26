package com.example.android.sem6_ses1_persistenceshared

import android.content.Context

class SharedPreference (val context: Context) {
    val PREFS_NAME = "sharedPreferences"

    val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun save(keyName: String, value: String){
        val editor = sharedPreferences.edit()
        editor.putString(keyName, value)
        editor.commit()
    }

    fun getValue(keyName: String): String?{//el "?"-> para nulos
        return sharedPreferences.getString(keyName, null)
    }
    fun clear(){
        val editor= sharedPreferences.edit()
        editor.clear()
        editor.commit()
    }
    fun removeValue(keyValue: String){
        val editor = sharedPreferences.edit()
        editor.remove(keyValue)
        editor.commit()
    }
}