
package agendaobjetos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AgendaObjetos {

    
     //mostarmenu
    
    public static int mostrarMenu(){
        int opcion;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Agenda ================");
        System.out.println("1- Añadir contacto");
        System.out.println("2- Mostrar contactos");
        System.out.println("3- Buscar contacto");
        System.out.println("4- Borrar contacto");
        System.out.println("0- Salir");
        System.out.println("=======================");
        System.out.println(" ");
        System.out.println("Escribe aqui...");
   
        opcion = leer.nextInt();
        return opcion;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  /*
        
        boolean bandera=true;
        
        do {            
            switch(mostrarMenu()){
                case 1:
                    
                    String nombre,telefono; 
                    int edad;
                    System.out.println("1- Añadir contacto ================");

                    System.out.println("Escribe su nombre");
                    Scanner leer = new Scanner(System.in);
                    nombre = leer.nextLine();

                    System.out.println("Escribe su telefono");
                    Scanner leer2 = new Scanner(System.in);
                    telefono = leer2.nextLine();
                    
                    System.out.println("Escribe su edad");
                    Scanner leer3 = new Scanner(System.in);
                    edad = leer3.nextInt();
                    
                    //mandarlo por un proceso o otro depende si esta la edad o no
                    
                    if (edad==0) {
                        Persona persona = new Persona(nombre, telefono);
                    } else {
                       Persona persona = new Persona(nombre, telefono, edad);
                    }
                  
    
                    
                    
                    break;
                case 2:
                    System.out.println("2- Mostrar contactos ================");
                    
                    
                    
                    break;
                case 3:
                    System.out.println("3- Buscar contacto ================");
                    
                    break;
                case 4:
                    System.out.println("4- Borarar contacto ================");
                    
                    break;
                case 0:
                System.out.println("No se como cerrar la aplicacion");
                bandera=false;
                break;
                
            default:
            
                System.out.println("Opción no válida"); 
            }
        } while (bandera);
*/
  


    }
    
}
