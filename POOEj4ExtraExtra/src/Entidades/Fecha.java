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
package Entidades;

/**
 *
 * @author Mile
 */
public class Fecha {

    private int dia;
    private int mes;
    private int ano;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1900;
    }

    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void verificarAno(int ano) {
        if (ano >= 1900 && ano <= 2021) {
            this.ano = ano;
        }
    }

    public void diasMes() {
        switch (this.mes) {
            case 1:
                System.out.println("Usted ingresó el mes 1 (enero), que tiene 31 días.");
                break;
            case 2:
                System.out.println("Usted ingresó el mes 2 (febrero), que tiene 28 días.");
                break;
            case 3:
                System.out.println("Usted ingresó el mes 3 (marzo), que tiene 31 días.");
                break;
            case 4:
                System.out.println("Usted ingresó el mes 4 (abril), que tiene 29 días.");
                break;
            case 5:
                System.out.println("Usted ingresó el mes 5 (mayo), que tiene 31 días.");
                break;
            case 6:
                System.out.println("Usted ingresó el mes 6 (junio), que tiene 30 días.");
                break;
            case 7:
                System.out.println("Usted ingresó el mes 7 (julio), que tiene 31 días.");
                break;
            case 8:
                System.out.println("Usted ingresó el mes 8 (agosto), que tiene 31 días.");
                break;
            case 9:
                System.out.println("Usted ingresó el mes 9 (septiembre), que tiene 30 días.");
                break;
            case 10:
                System.out.println("Usted ingresó el mes 10 (octubre), que tiene 31 días.");
                break;
            case 11:
                System.out.println("Usted ingresó el mes 11 (noviembre), que tiene 30 días.");
                break;
            case 12:
                System.out.println("Usted ingresó el mes 12 (diciembre), que tiene 31 días.");
                break;
        }
    }

    public void diaAnterior() {
        if (this.dia == 1) {
            if (this.mes == 2 || this.mes == 4 || this.mes == 6 || this.mes == 8 || this.mes == 9 || this.mes == 11 || this.mes == 1) {
                if (this.mes == 1) {
                    System.out.println("Fecha de ayer: " + 31 + "/" + "12" + "/" + (this.ano - 1));
                } else {
                    System.out.println("Fecha de ayer: " + 31 + "/" + (this.mes - 1) + "/" + this.ano);
                }
            } else if (this.mes == 7 || this.mes == 10 || this.mes == 12) {
                System.out.println("Fecha de ayer: " + 30 + "/" + (this.mes - 1) + "/" + this.ano);

            } else if (this.mes == 5) {
                System.out.println("Fecha de ayer: " + 29 + "/" + (this.mes - 1) + "/" + this.ano);
            } else if (this.mes == 3) {
                System.out.println("Fecha de ayer: " + 28 + "/" + (this.mes - 1) + "/" + this.ano);
            }
        } else {
            System.out.println("Fecha de ayer: " + (this.dia - 1) + "/" + (this.mes - 1) + "/" + this.ano);
        }

    }

    public void diaPosterior() {

        if (this.mes == 2 || this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11 || this.mes == 12) {
            if (this.dia == 31) {

                if (this.mes == 12) {
                    System.out.println("Fecha de mañana: " + "1" + "/" + "1" + "/" + (this.ano + 1));
                } else {
                    System.out.println("Fecha de mañana: " + "1" + "/" + (this.mes + 1) + "/" + this.ano);
                }
            } else if (this.mes == 2 && this.dia == 28) {
                System.out.println("Fecha de mañana: " + "31" + "/" + (this.mes + 1) + "/" + this.ano);

            } else if (this.mes == 4 && this.dia == 29) {
                System.out.println("Fecha de mañana: " + "31" + "/" + (this.mes + 1) + "/" + this.ano);
            } else {
                System.out.println("Fecha de mañana: " + (this.dia + 1) + "/" + this.mes + "/" + this.ano);
            }
        } else if ((this.mes == 6 || this.mes == 9 || this.mes == 11) && this.dia == 30) {
            System.out.println("Fecha de mañana: " + 1 + "/" + (this.mes + 1) + "/" + this.ano);

        } else {
            System.out.println("Fecha de mañana: " + (this.dia + 1) + "/" + this.mes + "/" + this.ano);

        }
    }

    public void bisiesto() {
        if (this.ano % 4 == 0) {
            System.out.println(this.ano + " es un año bisiesto.");
        } else {
            System.out.println(this.ano + " no es un año bisiesto.");
        }
    }

}
