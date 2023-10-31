package com.example.onversor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertir(View view){
        EditText editText=(findViewById(R.id.editTextText));
        String pesosString= editText.getText().toString();
        double pesos = Double.parseDouble(pesosString);
        double dolares = pesos*19.4;
        String dolaresString = String.format("%.2f",dolares);
        String mensaje="MNX"+ pesosString+"son USD"+dolaresString;
        Toast.makeText(this, mensaje,Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
