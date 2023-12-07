package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_activity1 -> {
                // Iniciar Actividad 1
                return true
            }
            R.id.action_activity2 -> {
                // Iniciar Actividad 2
                return true
            }
            R.id.action_activity3 -> {
                // Iniciar Actividad 3
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}