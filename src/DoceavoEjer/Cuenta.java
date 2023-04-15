/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoceavoEjer;

/**
 *
 * @author alvin
 */
public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 0.0;
    }
    
    public void ingresar(double cantidad){
        if (cantidad < 0) {
            System.out.println("La cantidad que introdujo es negativa");
        } else {
            setCantidad(getCantidad() + cantidad);
        }
    }
    public void retirar(double cantidad){
        if (getCantidad() - cantidad < 0) {
            setCantidad(0);
        } else {
            setCantidad(getCantidad() - cantidad);
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
}
