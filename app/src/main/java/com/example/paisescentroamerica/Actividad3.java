package com.example.paisescentroamerica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Actividad3 extends AppCompatActivity {
    String pais;
    TextView txtPais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
        txtPais=findViewById(R.id.txtPais);

        pais=getIntent().getStringExtra("PAIS");
        txtPais.setText(pais);



    }
}