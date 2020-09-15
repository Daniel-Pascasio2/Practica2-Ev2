package com.example.paisescentroamerica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAvanza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAvanzar = (Button) findViewById(R.id.btnAvanza);

        btnAvanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent unouno = new Intent(MainActivity.this, Actividad2.class);
                startActivity(unouno);
            }
        });




    }
}