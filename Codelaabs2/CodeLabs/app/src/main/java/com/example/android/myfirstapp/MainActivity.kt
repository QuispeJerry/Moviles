package com.example.android.myfirstapp

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.android.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

//    fun myButtonFirst(view: View){
//        view.findViewById<Button>(R.id.button2).setOnClickListener {
//            val myToast= Toast.makeText(applicationContext, "helooo", Toast.LENGTH_SHORT);
//            myToast.show();
//        }
//    }

//    fun myCountAdd(view: View){
//        println("1")
//        view.findViewById<Button>(R.id.button).setOnClickListener {
//            println("2")
//            val showCountAdd = view.findViewById<TextView>(R.id.textview_first);
//            println("3")
//            //val countString = view.findViewById<TextView>(R.id.textview_first).getText().toString();
//            println("4")
//            //var count = countString.toInt();
//            println("5")
//            //count++;
//            println("6")
//            view.findViewById<TextView>(R.id.textview_first).setText("count.toString()");
//            println("7")
//        }
//    }

//    private fun countMe(view: View) {
//        // Get the text view
//        val showCountTextView = view.findViewById<TextView>(R.id.textview_first)
//
//        // Get the value of the text view.
//        val countString = showCountTextView.text.toString()
//
//        // Convert value to a number and increment it
//        var count = countString.toInt()
//        count++
//
//        // Display the new value in the text view.
//        showCountTextView.text = count.toString()
//    }

}