package SegundoEjer;

/**
 *
 * @author alvin
 */
public class Triangulo {
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }
    public double calcularPerimetro() {
        return lado * 3;
    }
    public double calcularArea() {
        return (Math.sqrt(3)/4)* Math.pow(lado, 2);
    }
    public double hallarAltura() {
        return (Math.sqrt(3)*lado)/2;
    }
}
