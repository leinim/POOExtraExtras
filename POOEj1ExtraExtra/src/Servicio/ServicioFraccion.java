/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver
 */
package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class ServicioFraccion {
    
    Scanner leer = new Scanner(System.in);
    
    public Fraccion crearFraccion(){
        System.out.println("Ingrese el numerador de la fraccion 1");
        int n1 = leer.nextInt();
        System.out.println("Ingrese el denominador de la fraccion 1");
        int d1 = leer.nextInt();
        System.out.println("Ingrese el numerador de la fraccion 2");
        int n2 = leer.nextInt();
        System.out.println("Ingrese el denominador de la fraccion 2");
        int d2 = leer.nextInt();
                
        return new Fraccion(n1, d1, n2, d2);
    }
    
    public String sumar(Fraccion f){
        int a = f.getNumerador1();
        int b = f.getDenominador1();
        int c = f.getNumerador2();        
        int d = f.getDenominador2();
        
        //((A × D) + (B × C)) / B × D
        int sumaN = ((a * d) + (b * c));
        int sumaD = b * d;
        
        String sumaF = Integer.toString(sumaN) + "/" + Integer.toString(sumaD);
        
        return sumaF;
        
    }
    
    public String restar(Fraccion f){
        int a = f.getNumerador1();
        int b = f.getDenominador1();
        int c = f.getNumerador2();        
        int d = f.getDenominador2();
        
        int restaN = ((a * d) - (b * c));
        int restaD = b * d;
        
        String restaF = Integer.toString(restaN) + "/" + Integer.toString(restaD);
        
        return restaF;
        
    }
    
    public String multiplicar(Fraccion f){
        int a = f.getNumerador1();
        int b = f.getDenominador1();
        int c = f.getNumerador2();        
        int d = f.getDenominador2();
        
        int multiN = a * c;
        int multiD = b * d;
        
        String multiF = Integer.toString(multiN) + "/" + Integer.toString(multiD);
        
        return multiF;
    }
    
    public String dividir(Fraccion f){
        int a = f.getNumerador1();
        int b = f.getDenominador1();
        int c = f.getNumerador2();        
        int d = f.getDenominador2();
        
        int diviN = a * d;
        int diviD = b * c;
        
        String multiF = Integer.toString(diviN) + "/" + Integer.toString(diviD);
        
        return multiF;
        
    }
}
