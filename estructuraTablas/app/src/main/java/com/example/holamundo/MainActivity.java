package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Traza", "En evento Oncreate");
        TextView texto = new TextView(this);
        texto.setText("El ping pong me va a sacar de pobre");
        setContentView(texto);
        texto.setTextColor(getResources().getColor(R.color.yellow));

    }

    protected void salir(View view){
        finishActivity(0);
    }
}