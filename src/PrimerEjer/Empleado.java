/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerEjer;

/**
 *
 * @author alvin
 */
public class Empleado {
    private int ci;
    private String nombre;
    private String paterno;
    private double sueldoBase;
    private double pagoPorHoraExtra;
    private boolean casado;
    private int numeroDeHijos;
    private int horasExtra;

    public Empleado(int ci, String nombre, String paterno, double sueldoBase, double pagoPorHoraExtra, boolean casado, int numeroDeHijos, int horasExtra) {
        this.ci = ci;
        this.nombre = nombre;
        this.paterno = paterno;
        this.sueldoBase = sueldoBase;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
        this.casado = casado;
        this.numeroDeHijos = numeroDeHijos;
        this.horasExtra = horasExtra;
    }
    public Empleado() {
        ci = 0;
        nombre = "";
        paterno = "";
        sueldoBase = 0;
        pagoPorHoraExtra = 0;
        casado = true;
        numeroDeHijos = 0;
        horasExtra = 0;
    }
    public void introducirDatos(int ci, String nombre, String paterno, double sueldoBase, double pagoPorHoraExtra, boolean casado, int numeroDeHijos, int horasExtra){
        this.ci = ci;
        this.nombre = nombre;
        this.paterno = paterno;
        this.sueldoBase = sueldoBase;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
        this.casado = casado;
        this.numeroDeHijos = numeroDeHijos;
        this.horasExtra = horasExtra;
    }

    @Override
    public String toString() {
        return "Empleado{" + "ci=" + ci + ", nombre=" + nombre + ", paterno=" + paterno + ", sueldoBase=" + sueldoBase + ", pagoPorHoraExtra=" + pagoPorHoraExtra + ", casado=" + casado + ", numeroDeHijos=" + numeroDeHijos + ", horasExtra=" + horasExtra + '}';
    }

    
    public double salarioTotalEmp(){
        double total;
        total = sueldoBase + (pagoPorHoraExtra* horasExtra);
        return total;   
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumeroDeHijos() {
        return numeroDeHijos;
    }

    public void setNumeroDeHijos(int numeroDeHijos) {
        this.numeroDeHijos = numeroDeHijos;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    public String mostrarCasados() {
        return (isCasado()) ? toString(): "no esta casado";
    }
    public void incrementarSalario() {
        if(getNumeroDeHijos()> 3)
            setSueldoBase(getSueldoBase() * 1.3);
    }
}
