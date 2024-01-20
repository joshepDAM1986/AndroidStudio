package com.example.comunicacionactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nombre= findViewById(R.id.nombre) as EditText
        val boton= findViewById(R.id.verificar) as Button

        boton.setOnClickListener{
            val intent=Intent(this, Codiciones::class.java)
            intent.putExtra("nombre", nombre.text.toString())
            startActivity(intent)

        }
        val textResultado =findViewById(R.id.resultado) as TextView
        val extras= intent.extras
        val resultadoSustituir= extras?.getString("resultado")?: "No hay resultado"
        textResultado.setText((resultadoSustituir))
    }
}