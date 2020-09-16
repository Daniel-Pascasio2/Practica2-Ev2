package com.example.paisescentroamerica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Actividad4 extends AppCompatActivity {

    String pais;
    TextView txtPais;
    ListView listBilletes;
    Button btnBack;
    ArrayList<Billetes> moneda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);
        btnBack = findViewById(R.id.btnBack);
        txtPais=findViewById(R.id.txtPais);
        pais=getIntent().getStringExtra("PAIS");
        txtPais.setText(pais);
        listBilletes = findViewById(R.id.listBilletes);

        if(pais.equals("El Salvador")){
            llenarMonedaES();
        }

        if(pais.equals("Belize")){
            llenarMonedaBZ();
        }

        if(pais.equals("Guatemala")){
            llenarMonedaGT();
        }

        if(pais.equals("Honduras")){
            llenarMonedaHN();
        }

        if(pais.equals("Nicaragua")){
            llenarMonedaNG();
        }

        if(pais.equals("Costa Rica")){
            llenarMonedaCR();
        }

        if(pais.equals("Panama")){
            llenarMonedaPM();
        }
        AdaptadorMoneda ad = new AdaptadorMoneda(this);
        listBilletes.setAdapter(ad);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentR=new Intent(Actividad4.this, Actividad3.class);
                intentR.putExtra("PAIS",pais);
                startActivity(intentR);
            }
        });
    }
    public void llenarMonedaES()
    {
        moneda = new ArrayList<Billetes>();
        moneda.add(new Billetes(R.drawable.billete1));
        moneda.add(new Billetes(R.drawable.billete2));
        moneda.add(new Billetes(R.drawable.billete3));
    }
    public void llenarMonedaGT()
    {
        moneda = new ArrayList<Billetes>();
        moneda.add(new Billetes(R.drawable.quetzal1));
        moneda.add(new Billetes(R.drawable.quetzal2));
        moneda.add(new Billetes(R.drawable.quetzal3));
    }
    public void llenarMonedaBZ()
    {
        moneda = new ArrayList<Billetes>();
        moneda.add(new Billetes(R.drawable.beliceno1));
        moneda.add(new Billetes(R.drawable.beliceno2));
        moneda.add(new Billetes(R.drawable.beliceno3));
    }
    public void llenarMonedaHN()
    {
        moneda = new ArrayList<Billetes>();
        moneda.add(new Billetes(R.drawable.lempira1));
        moneda.add(new Billetes(R.drawable.lempira2));
        moneda.add(new Billetes(R.drawable.lempira3));
    }
    public void llenarMonedaNG()
    {
        moneda = new ArrayList<Billetes>();
        moneda.add(new Billetes(R.drawable.cordoba1));
        moneda.add(new Billetes(R.drawable.cordoba2));
        moneda.add(new Billetes(R.drawable.cordoba3));
    }
    public void llenarMonedaCR()
    {
        moneda = new ArrayList<Billetes>();
        moneda.add(new Billetes(R.drawable.coloncostarricense1));
        moneda.add(new Billetes(R.drawable.coloncostarricense2));
        moneda.add(new Billetes(R.drawable.coloncostarricense3));
    }
    public void llenarMonedaPM()
    {
        moneda = new ArrayList<Billetes>();
        moneda.add(new Billetes(R.drawable.balboa1));
        moneda.add(new Billetes(R.drawable.balboa2));
        moneda.add(new Billetes(R.drawable.balboa3));
    }
    class AdaptadorMoneda extends ArrayAdapter<Billetes> {
        AppCompatActivity appCompatActivity;
        ArrayList<Billetes> nel = new ArrayList<Billetes>();

        AdaptadorMoneda(AppCompatActivity context){
            super(context, R.layout.xml_billetes, moneda);
            appCompatActivity = context;
            this.nel = moneda;
        }

        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.xml_billetes, null);
            ImageView imageView1 = (ImageView)item.findViewById(R.id.imgBill);
            imageView1.setImageResource(nel.get(position).getImagen());

            return (item);
        }
    }
}