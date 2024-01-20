package com.example.postales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Postales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Establece el contenido de la actividad a partir del archivo de diseño XML llamado activity_postales.
        setContentView(R.layout.activity_postales)

        // Busca el TextView en la interfaz de usuario con el ID "textView2" y lo asigna a la variable 'saludo'.
        val saludo: TextView = findViewById(R.id.textView2)

        // Obtiene el Bundle de datos adjunto al Intent que inició esta actividad.
        val bundle: Bundle? = intent.extras

        // Obtiene la cadena asociada con la clave "SALUDO" del Bundle y la establece como el texto del TextView 'saludo'.
        saludo.text = bundle?.getString("SALUDO")
    }
}

