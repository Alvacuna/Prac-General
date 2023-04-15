/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreceavoEjer;

/**
 *
 * @author alvin
 */
public class Trabajador {
   private String ci;
    private double salarioBruto;
    
    public Trabajador(String ci, double salarioBruto) {
        this.ci = ci;
        this.salarioBruto = salarioBruto;
    }
    
    public String getCi() {
        return ci;
    }
    
    public void setCi(String ci) {
        this.ci = ci;
    }
    
    public double getSalarioBruto() {
        return salarioBruto;
    }
    
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public double getAporteAAFP() {
        return salarioBruto * 0.1;
    }
    
    public double getAporteAACP() {
        return salarioBruto * 0.025;
    }
    
    public double getAporteAARC() {
        return salarioBruto * 0.02;
    }
    
    public double getSalarioNeto() {
        return salarioBruto - getAporteAAFP() - getAporteAACP() - getAporteAARC();
    }
    
    public String getAportesYSalarioNeto() {
        return "Salario Bruto: " + salarioBruto + "\n" +
               "Aporte AAFP: " + getAporteAAFP() + "\n" +
               "Aporte AACP: " + getAporteAACP() + "\n" +
               "Aporte AARC: " + getAporteAARC() + "\n" +
               "Salario Neto: " + getSalarioNeto();
    }
    
    public String getAporteAAFPySalarioNeto() {
        return "Aporte AAFP: " + getAporteAAFP() + "\n" +
               "Salario Neto: " + getSalarioNeto();
    }   
}
