package com.example.paisescentroamerica;

public class Paises {


    //Declaracion de variables
    private String nombre;
    private String imagenP;

    //Creamo un constructor para asignarle valores  a las variables
    public Paises(String nombre, String imagenP){
        this.nombre=nombre;
        this.imagenP=imagenP;
    }




    //Metodos de tipo get para retornar el valor seleccionado nombre y letra
    public String getNombre(){
        return nombre;
    }

    public String getImagenP(){
        return imagenP;
    }


}
