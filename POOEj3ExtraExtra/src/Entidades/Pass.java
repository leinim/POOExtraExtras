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
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Pass {
    public String pass;
    public String nombre;
    public int dni;

    public Pass() {
    }

    public Pass(String pass, String nombre, int dni) {
        this.pass = pass;
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void crearPass(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cree una contraseña de 10 caracteres");
        String contraseña = leer.next();
            while (contraseña.length() != 10){
                System.out.println("Contraseña invalida. Ingrese una contraseña de 10 caracteres");
                contraseña = leer.next();          
        }
        this.pass = contraseña;
    }
    
    public void analizarPass(){
        int a = 0, z = 0;
        for (int i = 0; i < 10; i++){
            String letra = this.pass.substring(i, i+1).toLowerCase();
            switch (letra){
                case "z":
                    z++;
                    break;
                case "a":
                    a++;
                    break;                 
            }
        }
        if (z > 0 && a > 1){
            System.out.println("Su contraseña es nivel ALTO");
            
        } else if (z > 0 && a < 2) {
            System.out.println("Su contraseña es nivel MEDIO");
        } else {
            System.out.println("Su contraseña es nivel BAJO");
        }
    }
    
    public void modificarNombre(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su contraseña");
        String contraseña = leer.next();
        
        if (contraseña != this.pass){
            System.out.println("Contraseña incorrecta");
        } else {            
            System.out.println("Ingrese el nombre con su modificacion");
            this.nombre = leer.next();
            }
        }        
    

    public void modificarDNI(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su contraseña");
        String contraseña = leer.next();
        
        if (contraseña != this.pass) {
            System.out.println("Contraseña incorrecta");
        } else {
            System.out.println("Ingrese el dni modificado");
            this.dni = leer.nextInt();
        }
    }     
    
    public void modificarContraseña(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su contraseña actual");
        String contraseña = leer.next();
        
        if (contraseña != this.pass) {
            System.out.println("Contraseña incorrecta");
        } else {   
            crearPass();
        }         
    }
    
}
