package com.example.formulariobasico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Persona usuario;

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
                    Persona p=new Persona(edit_usuario.getText().toString(),edit_clave.getText().toString());
                    validarUsuario(p);
                    //Intent es para cambiar de activity
                    Intent intent = new Intent(MainActivity.this, Bienvenida.class);
                    startActivity(intent);
                }
            }
        });



    }

    public int validarUsuario(Persona u){
        BaseDatos bd= new BaseDatos();
        int n=9;
        for(Persona usu:bd.lista) {
            if(usu.getUser().equals(u.getUser())) {
                n=0;
                if(usu.getClave().equals(u.getClave())) {
                    n= 1;
                    break;
                }else n=-1;
            }
        }
        return n;
    }
}