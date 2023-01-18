/*
Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
Se deberá en métodos independientes:
● Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
● Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
● Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
cada mes)
Profe. Adri Bestilleiro
● Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
● Crear un método para verificar si el año ingresado es bisiesto

 */
package pooej4extraextra;

import Entidades.Fecha;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class POOEj4ExtraExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Fecha f1 = new Fecha();
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int ano = leer.nextInt();
        
        f1.verificarAno(ano);
        f1.setDia(dia);
        f1.setMes(mes);
        
        f1.diaAnterior();
        f1.diaPosterior();        
        f1.bisiesto();
    }
    
}
