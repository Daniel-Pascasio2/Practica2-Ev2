package com.example.paisescentroamerica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Actividad2 extends AppCompatActivity {

    //Declaramos los componentes de tipo View para vincularlos al xml
    Button btnContinuar, btnRegresar;
    ListView lvLista;
    TextView  txtSelecion,txtSelecion1;
    String seleccionP;

    //Creamos un Arraylist de tipo class paises solo instanciamos la clase
    ArrayList<Paises> listaPaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        btnContinuar=findViewById(R.id.btnContinuar);
        btnRegresar=findViewById(R.id.btnRegresar);
        lvLista=findViewById(R.id.lvlValores);
        txtSelecion=findViewById(R.id.txtSelecion);
        txtSelecion1=findViewById(R.id.txtSelecion1);

        LlenarArregloP();

        AdaptadorPaises adaptador=new AdaptadorPaises(this);
        lvLista.setAdapter(adaptador);

        //Desplegando el valor seleccionado por el usuario
        lvLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(Actividad2.this, listaPaises.get(i).getNombre(), Toast.LENGTH_LONG).show();
                //  txtSelecion.setText(listaContinentes.get(i).getNombre());


                if(listaPaises.get(i).getImagenP()=="El Salvador"){
                    txtSelecion.setText(listaPaises.get(i).getNombre());
                    txtSelecion1.setVisibility(View.INVISIBLE);
                }

                if(listaPaises.get(i).getImagenP()=="Belize"){
                    txtSelecion.setText(listaPaises.get(i).getNombre());
                    txtSelecion1.setVisibility(View.INVISIBLE);
                }

                if(listaPaises.get(i).getImagenP()=="Guatemala"){
                    txtSelecion.setText(listaPaises.get(i).getNombre());
                    txtSelecion1.setVisibility(View.INVISIBLE);
                }

                if(listaPaises.get(i).getImagenP()=="Honduras"){
                    txtSelecion.setText(listaPaises.get(i).getNombre());
                    txtSelecion1.setVisibility(View.INVISIBLE);
                }

                if(listaPaises.get(i).getImagenP()=="Nicaragua"){
                    txtSelecion.setText(listaPaises.get(i).getNombre());
                    txtSelecion1.setVisibility(View.INVISIBLE);
                }

                if(listaPaises.get(i).getImagenP()=="Costa Rica"){
                    txtSelecion.setText(listaPaises.get(i).getNombre());
                    txtSelecion1.setVisibility(View.INVISIBLE);
                }

                if(listaPaises.get(i).getImagenP()=="Panama"){
                    txtSelecion.setText(listaPaises.get(i).getNombre());
                    txtSelecion1.setVisibility(View.INVISIBLE);
                }



            }

        });

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtSelecion.setError(null);
                seleccionP=txtSelecion.getText().toString();

                if(seleccionP.equals("")){
                    //Primer error
                    txtSelecion1.setVisibility(View.VISIBLE);
                    txtSelecion1.setError("No puedes dejar campos vacios");
                    txtSelecion1.setText("Debe Seleccionar un Pais! ");
                    txtSelecion1.setTextColor(Color.RED);
                    //Colocamos un focus
                    txtSelecion1.requestFocus();
                    return;
                }

                txtSelecion1.setText("                        ");
                txtSelecion1.setVisibility(View.INVISIBLE);
                Intent intent=new Intent(Actividad2.this, Actividad3.class);
                intent.putExtra("PAIS",seleccionP );
                startActivity(intent);

            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentR=new Intent(Actividad2.this, MainActivity.class);
                startActivity(intentR);

            }
        });



    }

    private void LlenarArregloP() {
        //Creamos el objeto
        listaPaises=new ArrayList<Paises>();

        //llenamos el arraylist con objetos de la clase Continentes
        listaPaises.add(new Paises("El Salvador", "El Salvador"));
        listaPaises.add(new Paises("Belize", "Belize"));
        listaPaises.add(new Paises("Guatemala", "Guatemala"));
        listaPaises.add(new Paises("Honduras", "Honduras"));
        listaPaises.add(new Paises("Nicaragua", "Nicaragua"));
        listaPaises.add(new Paises("Costa Rica", "Costa Rica"));
        listaPaises.add(new Paises("Panama", "Panama"));

    }

    //Creamos una clase y heredamos de la clase ArrayAdapter para llenar el listView con los componentes View de xmlPaises
    class AdaptadorPaises extends ArrayAdapter<Paises> {
        AppCompatActivity appCompatActivity;

        //Creamos un constructor y usamos super para poder acceder a los elementos de la clase ArrayAdapter
        AdaptadorPaises(AppCompatActivity context){
            super(context, R.layout.xmlpaises, listaPaises);
            appCompatActivity=context;
        }

        //Creamos un metodo de tipo View para poder generara los componentes en el ListView


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater=appCompatActivity.getLayoutInflater();
            View item=inflater.inflate(R.layout.xmlpaises, null);

            TextView txtNom=item.findViewById(R.id.txtNom);
            //Mostramos la informacion de cada elemento dependiendo de su posicion
            txtNom.setText(listaPaises.get(position).getNombre());

            ImageView imagenCon=item.findViewById(R.id.imagenCont);

            if(listaPaises.get(position).getImagenP()=="El Salvador"){
                imagenCon.setImageResource(R.mipmap.elsalvador);
            }

            if(listaPaises.get(position).getImagenP()=="Belize"){
                imagenCon.setImageResource(R.mipmap.belize);
            }

            if(listaPaises.get(position).getImagenP()=="Guatemala"){
                imagenCon.setImageResource(R.mipmap.guatemala);
            }

            if(listaPaises.get(position).getImagenP()=="Honduras"){
                imagenCon.setImageResource(R.mipmap.honduras);
            }

            if(listaPaises.get(position).getImagenP()=="Nicaragua"){
                imagenCon.setImageResource(R.mipmap.nicaragua);
            }

            if(listaPaises.get(position).getImagenP()=="Costa Rica"){
                imagenCon.setImageResource(R.mipmap.costarica);
            }

            if(listaPaises.get(position).getImagenP()=="Panama"){
                imagenCon.setImageResource(R.mipmap.panama);
            }



            return (item);
        }
    }









}