package com.example.formulariobasico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text_respuesta;
    private Button btn_confirmar;

    private EditText edit_usuario;
    private EditText edit_clave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta=findViewById(R.id.textView3);
        edit_usuario = findViewById(R.id.usuario);
        edit_clave = findViewById(R.id.contraseña);


        //Suma
        btn_confirmar = findViewById(R.id.button_confirmar);
        btn_confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit_usuario.getText().toString().length() == 0 || edit_clave.getText().toString().length()==0){
                    //La casilla de usuario o clave esta vacia
                    text_respuesta.setText("Error_Usuario o clave vacíos");
                }else{
                    text_respuesta.setText("Se ha introducido correctamente");
                    introduceUsuario(edit_usuario.getText().toString(),edit_clave.getText().toString());
                    //Intent intento1 =new Intent(this, Bienvenida::class.java);
                    Intent intent = new Intent(MainActivity.this, Bienvenida.class);
                    //Intent intent = new Intent(MiActividad.this, MiOtraActividad.class);

                    startActivity(intent);
                }
            }
        });



    }

    public void introduceUsuario(String usuario,String clave){
        Persona p=new Persona(usuario,clave);
    }
}