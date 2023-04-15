/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OnceavoEjer;

/**
 *
 * @author alvin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda = new Agenda(10);

        Contacto contacto1 = new Contacto("Juan", 555-1234);
        Contacto contacto2 = new Contacto("María", 555-5678);

        agenda.añadirContacto(contacto1);
        agenda.añadirContacto(contacto2);
        agenda.añadirContacto(new Contacto("Juan", 5559999)); // Intenta añadir un contacto con el mismo nombre

        agenda.buscaContacto("Juan");
        agenda.buscaContacto("Pedro");

        agenda.eliminarContacto(contacto2);
        agenda.eliminarContacto(new Contacto("Pedro", 555-4321)); // Intenta eliminar un contacto que no existe

    }

}
