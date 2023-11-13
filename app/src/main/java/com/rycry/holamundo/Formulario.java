package com.rycry.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);


        Button btnIngresar= findViewById(R.id.btnIngresar);
        EditText edNombre, edApellido, edCedula, edCorreo, edDireccion;
        edNombre=findViewById(R.id.txtNombre);
        edApellido = findViewById(R.id.txtApellido);
        edCedula = findViewById(R.id.txtCedula);
        edCorreo = findViewById(R.id.txtCorreo);
        edDireccion = findViewById(R.id.txtDireccion);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=edNombre.getText().toString();
                if(!nombre.isEmpty()){
                    Toast.makeText(Formulario.this, "Informacion ingresada fokin correctamente", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}