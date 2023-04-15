/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnceavoEjer;

/**
 *
 * @author alvin
 */
public class Agenda {

    private Contacto[] contactos;
    private int numContactos;

    public Agenda(int capacidadMaxima) {
        contactos = new Contacto[capacidadMaxima];
        numContactos = 0;
    }

    public void añadirContacto(Contacto c) {
        if (!existeContacto(c)) {
            contactos[numContactos] = c;
            numContactos++;
            System.out.println("Contacto añadido correctamente.");
        } else {
            System.out.println("El contacto ya existe.");
        }
    }

    public boolean existeContacto(Contacto c) {
        for (int i = 0; i < numContactos; i++) {
            if (contactos[i].getNombre().equals(c.getNombre())) {
                return true;
            }
        }
        return false;
    }

    public void buscaContacto(String nombre) {
        for (int i = 0; i < numContactos; i++) {
            if (contactos[i].getNombre().equals(nombre)) {
                System.out.println("Teléfono de " + nombre + ": " + contactos[i].getNumero());
                return;
            }
        }
        System.out.println("No se encontró el contacto.");
    }

    public void eliminarContacto(Contacto c) {
        int indice = -1;
        for (int i = 0; i < numContactos; i++) {
            if (contactos[i].getNombre().equals(c.getNombre())) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            for (int i = indice; i < numContactos - 1; i++) {
                contactos[i] = contactos[i + 1];
            }
            numContactos--;
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("El contacto no existe.");
        }
    }
}
