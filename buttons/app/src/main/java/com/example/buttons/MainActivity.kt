package com.example.buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var entrada: EditText
    private lateinit var salida: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        entrada = findViewById(R.id.entrada);
        salida = findViewById(R.id.salida);

        var boton: Button =findViewById(R.id.boton0)

        boton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View){sePulsa0(v)}})
    }

    fun sePulsa(view: View){
        salida?.setText((java.lang.Float.parseFloat(
            entrada?.getText().toString()) * 2.0).toString())
    }

    fun sePulsa0(view: View) {
        entrada?.setText(entrada?.getText().toString() + view?.tag as String)
    }
}
