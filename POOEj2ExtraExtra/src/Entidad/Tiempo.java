/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola?????
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Tiempo {
    public int hora;
    public int minutos;
    public int segundos;

    public Tiempo() {
    }

    public Tiempo(int hora, int minutos, int segundos) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la hora");
        hora = leer.nextInt();
        this.hora = hora;
        System.out.println("Ingrese los minutos");
        minutos = leer.nextInt();
        this.minutos = minutos;
        System.out.println("Ingrese los segundos");        
        segundos = leer.nextInt();
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String imprimirHoraCompleta(){
        String horaCompleta = hora + " hrs " + minutos + " min " + segundos + " seg. ";
        return horaCompleta;
    }
    
    
    
    
}
