/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuartoEjer;

/**
 *
 * @author alvin
 */
public class DVD {
    private String titleAlbum;
    private String nombreCantante;
    private int numCanciones;
    private int añoAlbum;
    private double costo;
    private int numCopias;

    public DVD(String titleAlbum, String nombreCantante, int numCanciones, int añoAlbum, double costo, int numCopias) {
        this.titleAlbum = titleAlbum;
        this.nombreCantante = nombreCantante;
        this.numCanciones = numCanciones;
        this.añoAlbum = añoAlbum;
        this.costo = costo;
        this.numCopias = numCopias;
    }
    public DVD(){
        this.titleAlbum = "";
        this.nombreCantante = "";
        this.numCanciones = 0;
        this.añoAlbum = 0;
        this.costo = 0;
        this.numCopias = 0;
    }
    public void introducirDatos(String titleAlbum, String nombreCantante, int numCanciones, int añoAlbum, double costo, int numCopias) {
        this.titleAlbum = titleAlbum;
        this.nombreCantante = nombreCantante;
        this.numCanciones = numCanciones;
        this.añoAlbum = añoAlbum;
        this.costo = costo;
        this.numCopias = numCopias;
    }

    @Override
    public String toString() {
        return "DVD{" + "titleAlbum=" + titleAlbum + ", nombreCantante=" + nombreCantante + ", numCanciones=" + numCanciones + ", a\u00f1oAlbum=" + añoAlbum + ", costo=" + costo + ", numCopias=" + numCopias + '}';
    }

    public String getTitleAlbum() {
        return titleAlbum;
    }

    public void setTitleAlbum(String titleAlbum) {
        this.titleAlbum = titleAlbum;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public int getAñoAlbum() {
        return añoAlbum;
    }

    public void setAñoAlbum(int añoAlbum) {
        this.añoAlbum = añoAlbum;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }
    public String mostrarDiscosVal(){
        return (getCosto()>10) ? toString() : "el disco no cuesta mas de 10";
    }
    public void incrementCost(){
        setCosto(getCosto() * 1.4);
        System.out.println("el nuevo costo del disco es: "+getCosto());
    }
}
