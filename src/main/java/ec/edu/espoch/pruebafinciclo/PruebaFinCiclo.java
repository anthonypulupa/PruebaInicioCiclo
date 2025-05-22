/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.pruebafinciclo;

/**
 *
 * @author anthony
 */
public class PruebaFinCiclo {
    
    public class Mascota {
    private String nombre;
    private int edad;
    private String tipo; 

    public Mascota(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
    public String toString() {
        return nombre + " (" + tipo + ", " + edad + " años)";
    }
}
}
