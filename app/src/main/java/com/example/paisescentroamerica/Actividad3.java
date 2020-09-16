package com.example.paisescentroamerica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Actividad3 extends AppCompatActivity {
    String pais;
    TextView txtPais;
    Button btnContinuar, btnRegresar;

    private RecyclerView recyclerView;
    Adapter adapter;

    //Arreglos
    ArrayList<String> items;
    ArrayList<String> descripciones;
    ArrayList<Integer> ArrImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        pais=getIntent().getStringExtra("PAIS");
        recyclerView=findViewById(R.id.recyclerview);
        btnContinuar=findViewById(R.id.btnContinuar);


        if(pais.equals("El Salvador")){
           LlenarEs();
        }

        if(pais.equals("Belize")){
            LenarBelize();
        }

        if(pais.equals("Guatemala")){
           LlenarGuate();
        }

        if(pais.equals("Honduras")){
       LlenarHonduras();
        }

        if(pais.equals("Nicaragua")){
           LlenarNica();
        }

        if(pais.equals("Costa Rica")){
            LlenarCosta();
        }

        if(pais.equals("Panama")){
            LlenarPanama();
        }





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Adapter(this, items, descripciones, ArrImg);
        recyclerView.setAdapter(adapter);



        //Evento del boton

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(Actividad3.this, ActivityPoblacion.class);
                intent.putExtra("PAIS",pais);
                startActivity(intent);

            }
        });



    }

    private void LlenarPanama() {

    }

    private void LlenarCosta() {

    }

    private void LlenarNica() {

    }

    private void LlenarHonduras() {

    }

    private void LlenarGuate() {

    }

    private void LenarBelize() {

    }

    private void LlenarEs() {
        items=new ArrayList<>();
        items.add("El Salvador");
        items.add("Moneda: ");
        items.add("Escudo Nacional:");
        items.add("Ave Nacional:");
        items.add("Arbol Nacional: ");

        descripciones=new ArrayList<>();
        descripciones.add("15/09/1821");
        descripciones.add("Dolar");
        descripciones.add("");
        descripciones.add("Torogoz");
        descripciones.add("Maquilizgua");

        ArrImg=new ArrayList<>();
        ArrImg.add(R.drawable.elsalvador);
        ArrImg.add(R.drawable.monedaesa);
        ArrImg.add(R.drawable.escudo_elsalvador);
        ArrImg.add(R.drawable.torogozesa);
        ArrImg.add(R.drawable.maquilishuatesa);

    }
}