package com.example.comunicacionactividades

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Codiciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_codiciones)

        val nombreRecibido = intent.getStringExtra("nombre")
        var textFulanito = findViewById(R.id.textView2) as TextView
        var nombreSustituir =
            textFulanito.text.toString().replace("fulanito", nombreRecibido.toString())
        textFulanito.setText(nombreSustituir)

        val aceptar = findViewById(R.id.aceptar) as Button
        val rechazar = findViewById(R.id.rechazar) as Button


        aceptar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("resultado", "Has aceptado las condiciones")
            startActivity(intent)
        }

        rechazar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("resultado", "Has rechazado las condiciones")
            startActivity(intent)
        }
    }
}