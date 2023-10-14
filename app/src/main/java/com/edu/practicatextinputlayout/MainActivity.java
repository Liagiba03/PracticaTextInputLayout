package com.edu.practicatextinputlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private ImageView btnCambio;
    private TextInputEditText txtEmail;
    private TextInputEditText txtContra;
    private TextInputEditText txtEdad;
    private AppCompatButton btnSalir;
    private TextInputLayout layEmail;
    private TextInputLayout layContra;
    private TextInputLayout layEdad;
    private FloatingActionButton btnEnlazar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCambio= findViewById(R.id.buttonCambio);
        txtEmail = findViewById(R.id.etxtMail);
        txtContra = findViewById(R.id.etxtContra);
        txtEdad = findViewById(R.id.etxtNumero);
        btnSalir = findViewById(R.id.btnSalir);
        layEmail= findViewById(R.id.layoutEmail);
        layContra = findViewById(R.id.layoutCOntra);
        layEdad = findViewById(R.id.layoutEdad);
        btnEnlazar = findViewById(R.id.btnfEnlazar);

        btnCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int edad;
                if(txtEmail.getText().toString().trim().length()==0){
                    txtEmail.setError("Debe ingresar el Email");

                }else if(txtContra.getText().toString().trim().length() ==0){
                    txtContra.setError("Coloca una contraseña");

                }else if(txtEdad.getText().toString().trim().length() ==0){
                    txtEdad.setError("Coloca una edad");

                    try {
                        edad= Integer.parseInt(txtEdad.getText().toString());

                    }catch (Exception ex) {
                        txtEdad.setError("Ingresa un valor numerico");
                    }
                }
                btnCambio.setBackgroundResource(R.drawable.botonrojo);

            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnEnlazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent para abrir una nueva actividad
                Intent abrir = new Intent(MainActivity.this,
                        SegundaActividad.class);
                startActivity(abrir);

            }
        });
    }
}