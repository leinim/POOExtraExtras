/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola?????
 */
package pooej2extraextra;

import Entidad.Tiempo;

/**
 *
 * @author Mile
 */
public class POOEj2ExtraExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hora = 0, minutos = 0, segundos = 0;        
        Tiempo t1 = new Tiempo(hora, minutos, segundos);
        
        System.out.println("Hora: " + t1.imprimirHoraCompleta());
    }
    
}
