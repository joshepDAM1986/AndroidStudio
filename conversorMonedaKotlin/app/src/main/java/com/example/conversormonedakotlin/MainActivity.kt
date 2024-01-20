package com.example.conversormonedakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var monedas: ArrayList<String>? = null
    private var spinner: Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner = findViewById<View>(R.id.spinner) as Spinner
        monedas = ArrayList()
        monedas!!.add("Dolar")
        monedas!!.add("Yen")
        monedas!!.add("Yuan")

        // Configurar adaptador
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item, monedas!!
        )
        spinner!!.adapter = adapter

        val botonConvertir: Button = findViewById(R.id.button)


    }
}