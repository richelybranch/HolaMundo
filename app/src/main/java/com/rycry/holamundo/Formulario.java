package com.rycry.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    // Declara los EditText como variables de clase para que estén disponibles en toda la clase
    EditText edNombre, edApellido, edCedula, edCorreo, edDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button btnIngresar = findViewById(R.id.btnIngresar);

        // Inicializa los EditText
        edNombre = findViewById(R.id.txtNombre);
        edApellido = findViewById(R.id.txtApellido);
        edCedula = findViewById(R.id.txtCedula);
        edCorreo = findViewById(R.id.txtCorreo);
        edDireccion = findViewById(R.id.txtDireccion);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (camposEstanVacios()) {
                    Toast.makeText(Formulario.this, "Llene todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    String nombre = edNombre.getText().toString();
                    Toast.makeText(Formulario.this, "Informacion ingresada correctamente: " + nombre, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean camposEstanVacios() {
        // Ahora puedes acceder a los EditText directamente porque son variables de clase
        return edNombre.getText().toString().isEmpty() ||
                edApellido.getText().toString().isEmpty() ||
                edCedula.getText().toString().isEmpty() ||
                edCorreo.getText().toString().isEmpty() ||
                edDireccion.getText().toString().isEmpty();
    }
}
