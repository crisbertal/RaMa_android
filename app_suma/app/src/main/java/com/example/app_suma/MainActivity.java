package com.example.app_suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText primerSumando, segundoSumando;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.primerSumando = findViewById(R.id.edit_text_primer_sumando);
        this.segundoSumando = findViewById(R.id.edit_text_segundo_sumando);
        this.resultado = findViewById(R.id.text_view_resultado);
    }

    public void sumar(View view) {
        if (this.primerSumando.getText().toString().equals("") || this.segundoSumando.getText().toString().equals("")) {
            Toast.makeText(this, "Algun campo esta vacio", Toast.LENGTH_SHORT).show();
        } else {
            int primerNumero = Integer.parseInt(primerSumando.getText().toString());
            int segundoNumero = Integer.parseInt(segundoSumando.getText().toString());
            this.resultado.setText(String.valueOf(primerNumero + segundoNumero));
        }
    }

    public void salir(View view) {
        this.finish();
    }
}
