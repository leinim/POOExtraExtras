/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie

 */
package Entidades;

/**
 *
 * @author Mile
 */
public class Triangulo {
    private float altura;
    private float base;

    public Triangulo() {
    }

    public Triangulo(float altura, float base) {
        this.altura = altura;
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "altura=" + altura + "cm" +", base=" + base + "cm" + '}';
    }
    
    public float calcularArea(){        
        float area;
        area = (this.base * this.altura) / 2;
        return area;
    }
    
    public float calcularPerimetro(){        
        float a = (float) Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.base, 2));
        float perimetro = 2 * a + this.base;
        return perimetro;
    }
    
    public void areaMayorMostrar(Triangulo[] triangulos){
        float areaMayor = 0;
        int contador = 0;
        for (int i = 0; i < 4; i++){
            if (triangulos[i].calcularArea() > areaMayor){
                areaMayor = triangulos[i].calcularArea();
                contador++;
            }            
        }
        System.out.println(triangulos[contador-1].toString() + ", Area: " + triangulos[contador-1].calcularArea() + "cm, Perimetro: " + triangulos[contador-1].calcularPerimetro() + " cm.");
               
    }
}
