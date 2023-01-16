/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package pooej1extraextra;

import Entidad.Fraccion;
import Servicio.ServicioFraccion;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class POOEj1ExtraExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioFraccion sf = new ServicioFraccion();
        Fraccion f1 = new Fraccion();
        
        f1 = sf.crearFraccion();
        int opcion;
        String respuesta;
        
        do{
        System.out.println("- MENU -");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        opcion = leer.nextInt();
        
        
        switch (opcion){
            case 1:
                System.out.println(sf.sumar(f1));
                break;
            case 2:
                System.out.println(sf.restar(f1));
                break;
            case 3:
                System.out.println(sf.multiplicar(f1));
                break;
            case 4:
                System.out.println(sf.dividir(f1));
                break;
            case 5:
                System.out.println("Hasta pronto!");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        }while (opcion != 5);
        
        
       
        
        
                
        
    }
    
}
