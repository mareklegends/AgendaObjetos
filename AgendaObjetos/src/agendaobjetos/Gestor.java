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
public class Gestor {
    
    private String nombre;
    private Persona[] vAgenda;

    public Gestor(String nombre) {
        this.nombre = nombre;
        this.vAgenda = new Persona[10];
        //Borrar luego
        
        vAgenda[0]= new Persona("Juan", "111");
        vAgenda[1]= new Persona("Pepe", "111",25);
        
    }
    public String mostrarTodasPersonas(){
        String datos;
        datos = "hola";
        return datos;
    }
    
    
    
}
