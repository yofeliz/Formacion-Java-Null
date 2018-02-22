/**
 * Programa de refresco que muestra el comportamiento de los punteros.
 * @author yofeliz
 */

public class Nulles {

    public static void main(String[] params) {
        Persona p1 = new Persona("Pepito Grillo");
        System.out.println("Nombre p1: " + p1.getNombre());
        
        Persona p2 = p1;
        System.out.println("Nombre p2: " + p2.getNombre());
        
        p1 = null;
        
        System.out.println("Nombre p2: " + p2.getNombre());
        
        if(p1!=null) {
            System.out.println("Nombre p1: " + p1.getNombre());
        }//if
    }//main
    
}//Nulles

//Clase de ejemplo.
class Persona {
    
    String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }//Constructor
    
    public String getNombre() {
        return nombre;
    }//getNombre
    
}//claseEjemplo