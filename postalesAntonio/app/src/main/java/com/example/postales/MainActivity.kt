package com.example.postales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Busca el botón con el ID "button" en la interfaz de usuario y lo asigna a la variable 'but'.
        val but: Button = findViewById(R.id.button)

        // Busca el EditText con el ID "editTextText" en la interfaz de usuario y lo asigna a la variable 'edt'.
        val edt: EditText = findViewById(R.id.editTextText)

        // Configura un listener de clic para el botón 'but'.
        but.setOnClickListener {
            // Crea un nuevo Intent que representa la transición desde esta actividad (MainActivity) a la actividad Postales.
            val intent = Intent(this@MainActivity, Postales::class.java)

            // Crea un Bundle para pasar datos entre actividades y coloca una cadena con la clave "SALUDO" y el contenido del EditText.
            val bundle = Bundle()
            bundle.putString("SALUDO", edt.text.toString())

            // Asocia el Bundle con el Intent.
            intent.putExtras(bundle)

            // Inicia la nueva actividad utilizando el Intent configurado.
            startActivity(intent)
        }
    }
}


