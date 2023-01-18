/*
Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.
Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios

 */
package pooej3extraextra;

import Entidades.Pass;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class POOEj3ExtraExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pass p1 = new Pass(null, "Mile", 39387464);
        Pass p2 = new Pass(null, "Ana", 12345678);
        int opcion = 0;
        
        while (opcion != 6) {
        System.out.println("Menu");
        System.out.println("1 - Crear contraseña");
        System.out.println("2 - Nivel de contraseña");
        System.out.println("3 - Modificar contraseña");
        System.out.println("4 - Modificar nombre");
        System.out.println("5 - Modificar dni");
        System.out.println("6 - Salir");
        opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    p1.crearPass();
                    break;
                case 2:
                    p1.analizarPass();
                    break;
                case 3:
                    p1.modificarContraseña();
                    break;
                case 4:
                    p1.modificarNombre();
                    break;
                case 5:
                    p1.modificarDNI();
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } 
        
        System.out.println(p1.toString());
        System.out.println("Hasta pronto.");
    }
    
}
