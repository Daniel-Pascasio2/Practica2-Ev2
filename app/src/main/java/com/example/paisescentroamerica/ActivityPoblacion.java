package com.example.paisescentroamerica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.icu.lang.UCharacter;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.LargeValueFormatter;
import com.github.mikephil.charting.formatter.PercentFormatter;

import java.util.ArrayList;

public class ActivityPoblacion extends AppCompatActivity {
    private PieChart pieChart;
    private Button btnMostrar, btnRegresar;
    String pais;
    private EditText etCant;
    private TextView txtP;
    String[] persons = new String[]{"Hombres","Mujeres","Niños"};
    ArrayList<Float> personsC = new ArrayList<>();
    int[] color = new int[]{Color.GREEN,Color.BLUE,Color.RED};
    double canti,Hombres,Mujeres,Ninos;
    float c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poblacion);
        pieChart = findViewById(R.id.graphPie);
        btnMostrar = findViewById(R.id.btnMostrar);
        btnRegresar = findViewById(R.id.btnRegresar);
        txtP=findViewById(R.id.txPaisde);
        pais=getIntent().getStringExtra("PAIS");
        txtP.setText("Poblacion de "+pais);
        etCant = findViewById(R.id.etNum);

        btnMostrar.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                etCant.setError(null);
                String Ingreso=etCant.getText().toString();
                if(Ingreso.equals("")){
                    //etCant.setVisibility(View.VISIBLE);
                    etCant.setError("No puedes dejar campos vacios");
                    etCant.requestFocus();
                    return;
                }
                canti = Double.parseDouble(etCant.getText().toString());

                Hombres = canti * 0.25;
                Mujeres = canti * 0.35;
                Ninos = canti * 0.40;

                final float r1 = (float) Hombres;
                final float r2 = (float) Mujeres;
                final float r3 = (float) Ninos;

                for(int i=0;i<persons.length;i++){
                    if(i==0)

                        personsC.add(i,r1);
                    if(i==1)
                        personsC.add(i,r2);
                    if(i==2)
                        personsC.add(i,r3);
                }

                createCharts();
            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentR=new Intent(ActivityPoblacion.this, Actividad3.class);
                intentR.putExtra("PAIS",pais);
                startActivity(intentR);

            }
        });

    }

    private Chart getSameChart(Chart chart, String desc, int teColor, int Background,int animateY)
    {
        chart.getDescription().setText(desc);
        chart.getDescription().setTextSize(15);
        chart.setBackgroundColor(Background);
        chart.animateY(animateY);
        legend(chart);
        return chart;
    }
    private void legend(Chart chart){
        Legend legend = chart.getLegend();
        legend.setForm(Legend.LegendForm.CIRCLE);

        ArrayList<LegendEntry> entries = new ArrayList<>();

        for(int k = 0;k<persons.length;k++){
            LegendEntry entry = new LegendEntry();
            entry.formColor=color[k];
            entry.label = persons[k];
            entries.add(entry);
        }
        legend.setCustom(entries);
    }
    private ArrayList<PieEntry> getPieEntries(){

        ArrayList<PieEntry> entries = new ArrayList<>();
        for(int i =0; i< persons.length;i++)
        {
            entries.add(new PieEntry(personsC.get(i)));
        }
        return entries;
    }
    public void createCharts(){

        pieChart= (PieChart)getSameChart(pieChart,"Poblacion "+pais,Color.GRAY,Color.WHITE,900);
        pieChart.setHoleRadius(10);
        pieChart.setTransparentCircleRadius(12);
        pieChart.setData(getPieData());
        pieChart.invalidate();


    }
    private DataSet getData(DataSet dataSet)
    {
        dataSet.setColors(color);
        dataSet.setValueTextSize(Color.WHITE);
        dataSet.setValueTextSize(10);
        return dataSet;
    }
    private PieData getPieData(){
        PieDataSet pieDatSet=(PieDataSet)getData(new PieDataSet(getPieEntries(),""));
        pieDatSet.getSliceSpace();
        pieDatSet.setValueFormatter(new LargeValueFormatter());
        return new PieData(pieDatSet);
    }

}