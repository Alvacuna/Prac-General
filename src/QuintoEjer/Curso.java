/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintoEjer;

/**
 *
 * @author alvin
 */
public class Curso {
    private String nombre;
    private String ubicacion;
    private int Dias;
    private String inicio;
    private String fin;    

    public Curso(String nombre, String ubicacion, int Dias, String inicio, String fin) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.Dias = Dias;
        this.inicio = inicio;
        this.fin = fin;
    }

    public Curso(String nombre, String inicio, String fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getDias() {
        return Dias;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", Dias=" + Dias + ", inicio=" + inicio + ", fin=" + fin + '}';
    }
    public String mostrarIncomp(){
        return "Curso: "+ "nombre " + nombre + "inicio " +inicio+ "fin "+ fin;
    }
    public void mostrar_datos() {
        System.out.println("Nombre del curso: " + nombre);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Días: " + Dias);
        System.out.println("Fecha de inicio: " + inicio);
        System.out.println("Fecha de fin: " + fin);
    }
    public void inicializar(String ubicacion, int dias) {
        this.ubicacion = ubicacion;
        this.Dias = dias;
    }
}
