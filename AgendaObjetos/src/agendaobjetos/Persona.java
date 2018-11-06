/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaobjetos;

/**
 *
 * @author alumno
 */
public class Persona {
        private String nombre;
    private String telefono;
    private int edad;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona(String nombre, String telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        String datos;
        datos = "> Nombre = " + nombre + "\n Telefono = " + telefono + "\n Edad = " + edad;
        return  datos;
    }
    
    
    
    
  

    
}
