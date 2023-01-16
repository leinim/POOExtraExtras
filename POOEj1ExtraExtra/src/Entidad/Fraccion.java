/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package Entidad;

/**
 *
 * @author Mile
 */
public class Fraccion {
    
    private int numerador1;
    private int denominador1;
    private int numerador2;    
    private int denominador2;

    public Fraccion() {
    }

    public Fraccion(int numerador1, int denominador1, int numerador2, int denominador2) {
        this.numerador1 = numerador1;
        this.denominador1 = denominador1;
        this.numerador2 = numerador2;
        this.denominador2 = denominador2;
    }

    public int getNumerador1() {
        return numerador1;
    }

    public int getDenominador1() {
        return denominador1;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public void setNumerador1(int numerador1) {
        this.numerador1 = numerador1;
    }

    public void setDenominador1(int denominador1) {
        this.denominador1 = denominador1;
    }

    public void setNumerador2(int numerador2) {
        this.numerador2 = numerador2;
    }

    public void setDenominador2(int denominador2) {
        this.denominador2 = denominador2;
    }

    @Override
    public String toString() {
        return "Fraccion{" + "numerador1=" + numerador1 + ", denominador1=" + denominador1 + ", numerador2=" + numerador2 + ", denominador2=" + denominador2 + '}';
    }
    
    


    
}
