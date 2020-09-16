package com.example.paisescentroamerica;

public class Informacion {
    private String pais, fecha, moneda, ave, arbol;
    private int mapa, escudo, imgAve, imgArbol;

    public Informacion() {
    }

    public Informacion(String pais, String fecha, String moneda, String ave, String arbol, int mapa, int escudo, int imgAve, int imgArbol) {
        this.pais = pais;
        this.fecha = fecha;
        this.moneda = moneda;
        this.ave = ave;
        this.arbol = arbol;
        this.mapa = mapa;
        this.escudo = escudo;
        this.imgAve = imgAve;
        this.imgArbol = imgArbol;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getAve() {
        return ave;
    }

    public void setAve(String ave) {
        this.ave = ave;
    }

    public String getArbol() {
        return arbol;
    }

    public void setArbol(String arbol) {
        this.arbol = arbol;
    }

    public int getMapa() {
        return mapa;
    }

    public void setMapa(int mapa) {
        this.mapa = mapa;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getImgAve() {
        return imgAve;
    }

    public void setImgAve(int imgAve) {
        this.imgAve = imgAve;
    }

    public int getImgArbol() {
        return imgArbol;
    }

    public void setImgArbol(int imgArbol) {
        this.imgArbol = imgArbol;
    }
}
