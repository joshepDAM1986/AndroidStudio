package com.example.miapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val toolbar = findViewById<Toolbar>(R.id.toolbar)
            setSupportActionBar(toolbar)

            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            val mainFragment = MainFragment()
            fragmentTransaction.replace(R.id.fragment_container, mainFragment)
            fragmentTransaction.commit()
        }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.main_menu, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.action_option1 -> {
                    startActivity(Intent(this, Actividad2::class.java))
                    return true
                }
                R.id.action_option2 -> {
                    startActivity(Intent(this, Actividad3::class.java))
                    return true
                }
                else -> return super.onOptionsItemSelected(item)
            }
        }
    }
}