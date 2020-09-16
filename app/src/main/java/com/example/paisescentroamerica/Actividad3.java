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
        btnRegresar=findViewById(R.id.btnRegresar);


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

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentR=new Intent(Actividad3.this, Actividad2.class);
                startActivity(intentR);

            }
        });


    }

    private void LlenarPanama() {
        items=new ArrayList<>();
        items.add("Panama");
        items.add("Moneda: ");
        items.add("Escudo Nacional:");
        items.add("Ave Nacional:");
        items.add("Arbol Nacional: ");

        descripciones=new ArrayList<>();
        descripciones.add("28/11/1821");
        descripciones.add("Balboa");
        descripciones.add("");
        descripciones.add("Águila Harpía");
        descripciones.add("Sterculia");

        ArrImg=new ArrayList<>();
        ArrImg.add(R.drawable.panama);
        ArrImg.add(R.drawable.monedapan);
        ArrImg.add(R.drawable.escudo_panama);
        ArrImg.add(R.drawable.harpiapan);
        ArrImg.add(R.drawable.amorucopan);
    }

    private void LlenarCosta() {
        items=new ArrayList<>();
        items.add("Costa Rica");
        items.add("Moneda: ");
        items.add("Escudo Nacional:");
        items.add("Ave Nacional:");
        items.add("Arbol Nacional: ");

        descripciones=new ArrayList<>();
        descripciones.add("15/09/1821");
        descripciones.add("Colon Costarricence");
        descripciones.add("");
        descripciones.add("Yiguirro");
        descripciones.add("Guanacaste");

        ArrImg=new ArrayList<>();
        ArrImg.add(R.drawable.costarica);
        ArrImg.add(R.drawable.monedacor);
        ArrImg.add(R.drawable.escudo_costarica);
        ArrImg.add(R.drawable.yiguirrocor);
        ArrImg.add(R.drawable.guanacastecor);
    }

    private void LlenarNica() {
        items=new ArrayList<>();
        items.add("Nicaragua");
        items.add("Moneda: ");
        items.add("Escudo Nacional:");
        items.add("Ave Nacional:");
        items.add("Arbol Nacional: ");

        descripciones=new ArrayList<>();
        descripciones.add("15/09/1821");
        descripciones.add("Cordoba");
        descripciones.add("");
        descripciones.add("Guardabarranco");
        descripciones.add("Madroño");

        ArrImg=new ArrayList<>();
        ArrImg.add(R.drawable.nicaragua);
        ArrImg.add(R.drawable.monedanic);
        ArrImg.add(R.drawable.escudo_nicaragua);
        ArrImg.add(R.drawable.guardabarranconic);
        ArrImg.add(R.drawable.madrononic);
    }

    private void LlenarHonduras() {
        items=new ArrayList<>();
        items.add("Honduras");
        items.add("Moneda: ");
        items.add("Escudo Nacional:");
        items.add("Ave Nacional:");
        items.add("Arbol Nacional: ");

        descripciones=new ArrayList<>();
        descripciones.add("15/11/1838");
        descripciones.add("Lempira");
        descripciones.add("");
        descripciones.add("Guara");
        descripciones.add("Pino");

        ArrImg=new ArrayList<>();
        ArrImg.add(R.drawable.honduras);
        ArrImg.add(R.drawable.monedahon);
        ArrImg.add(R.drawable.escudo_honduras);
        ArrImg.add(R.drawable.guarahon);
        ArrImg.add(R.drawable.pinohhon);
    }

    private void LlenarGuate() {
        items=new ArrayList<>();
        items.add("Guatemala");
        items.add("Moneda: ");
        items.add("Escudo Nacional:");
        items.add("Ave Nacional:");
        items.add("Arbol Nacional: ");

        descripciones=new ArrayList<>();
        descripciones.add("15/09/1821");
        descripciones.add("Quetzal");
        descripciones.add("");
        descripciones.add("Quetzal");
        descripciones.add("Ceiba");

        ArrImg=new ArrayList<>();
        ArrImg.add(R.drawable.guatemal);
        ArrImg.add(R.drawable.monedagua);
        ArrImg.add(R.drawable.escudo_guatemala);
        ArrImg.add(R.drawable.quetzalgua);
        ArrImg.add(R.drawable.ceibagua);
    }

    private void LenarBelize() {
        items=new ArrayList<>();
        items.add("Belice");
        items.add("Moneda: ");
        items.add("Escudo Nacional:");
        items.add("Ave Nacional:");
        items.add("Arbol Nacional: ");

        descripciones=new ArrayList<>();
        descripciones.add("21/09/1981");
        descripciones.add("Dolar Beliceño");
        descripciones.add("");
        descripciones.add("Tucan");
        descripciones.add("Caoba");

        ArrImg=new ArrayList<>();
        ArrImg.add(R.drawable.belice);
        ArrImg.add(R.drawable.monedabel);
        ArrImg.add(R.drawable.escudo_belice);
        ArrImg.add(R.drawable.tucanbel);
        ArrImg.add(R.drawable.caoba);
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