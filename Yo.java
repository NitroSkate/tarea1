/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yo;

/**
 *
 * @author nitroskate
 */
public class Yo {

    String nombre;
    String apellido;
    int edad;
    String profesion;
    String fechanac;
    String carnet;
    
    public static void main(String[] args) {
        
        Yo yo = new Yo();
        
        yo.nombre = "Joshua";
        yo.apellido = "Sharp";
        yo.edad = 20;
        yo.profesion = "Estudiante";
        yo.fechanac = "5 de Noviembre de 1997";
        yo.carnet = "00159817";
        
        System.out.println("Mi nombre es: "+yo.nombre);
        System.out.println("Mi apellido es: "+yo.apellido);
        System.out.println("Mi edad es: "+yo.edad);
        System.out.println("Mi profesion es: "+yo.profesion);
        System.out.println("Mi fecha de nacimiento es: "+yo.fechanac);
        System.out.println("Mi carnet es: "+yo.carnet);
        
        
    }
    
}
