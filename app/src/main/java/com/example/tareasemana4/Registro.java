package com.example.tareasemana4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Registro extends Fragment {

    private EditText editTextName;
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonSubmit;

    public Registro() {
        // Required empty public constructor
    }

    public static Registro newInstance() {
        return new Registro();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_registro, container, false);

        // Obtener referencias a los elementos del layout
        editTextName = rootView.findViewById(R.id.editTextName);
        editTextUsername = rootView.findViewById(R.id.editTextUsername);
        editTextPassword = rootView.findViewById(R.id.editTextPassword);
        buttonSubmit = rootView.findViewById(R.id.buttonSubmit);

        // Configurar el click listener para el botón de enviar
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores ingresados por el usuario
                String name = editTextName.getText().toString().trim();
                String username = editTextUsername.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Validar que se ingresen todos los campos
                if (name.isEmpty() || username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(getActivity(), "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Realizar el registro (puedes guardar los datos en variables internas o en una base de datos)
                    // Aquí puedes mostrar una alerta o realizar cualquier otra acción deseada
                    Toast.makeText(getActivity(), "¡Registro exitoso!", Toast.LENGTH_SHORT).show();

                    // Ocultar los tabs y mostrar un mensaje de bienvenida con el nombre ingresado
                    // Puedes cambiar a otra actividad o cargar un nuevo fragmento sin los tabs
                }
            }
        });

        return rootView;
    }
}
