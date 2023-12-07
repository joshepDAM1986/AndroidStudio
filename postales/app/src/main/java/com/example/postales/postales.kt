package com.example.postales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Postales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postales)

        val saludo: TextView = findViewById(R.id.textView)
        val bundle: Bundle? = intent.extras

        saludo.text = bundle?.getString("SALUDO")
    }
}