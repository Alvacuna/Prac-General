/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecimoEjer;

/**
 *
 * @author alvin
 */
public class Conductor {

    public String nombre;
    public String apellido;
    public String numeroDocumento;
    public int anioNacimiento;
    public String categoriaLicencia;

    public Conductor(String nombre, String apellido, String numeroDocumento, int anioNacimiento, String categoriaLicencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.anioNacimiento = anioNacimiento;
        this.categoriaLicencia = categoriaLicencia;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de documento: " + numeroDocumento);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("Categoría de licencia: " + categoriaLicencia);
    }
}
