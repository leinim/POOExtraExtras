/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie

 */
package pooej5extraextra;

import Entidades.Triangulo;

/**
 *
 * @author Mile
 */
public class POOEj5ExtraExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Triangulo[] triangulos = new Triangulo[4];
        Triangulo t = new Triangulo();       
        
        triangulos[0] = new Triangulo(4, 8);
        triangulos[1] = new Triangulo(7, 6);
        triangulos[2] = new Triangulo(2, 3);
        triangulos[3] = new Triangulo(5, 6);
        
        t.areaMayorMostrar(triangulos);       
        
    }
    
}
