package com.example.formulariobasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bienvenida extends AppCompatActivity {

    private TextView text_bienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        text_bienvenida=findViewById(R.id.textView6);

        text_bienvenida.setText(text_bienvenida.getText().toString()+" usuario");
    }
}