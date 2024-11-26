/*
A continuación, utilizaremos los ejercicios que ya has resuelto anteriormente como base, pero esta vez vas a aplicar el uso de métodos en su resolución. 

Imprimir nombre:  Crea un método llamado imprimeNombre() que reciba por parámetro un nombre y luego imprima el mensaje "Mi nombre es [nombre]". Invocar dicho método desde el método main para ver el mensaje por consola

Imprimir nombre y edad: Crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, el nombre y la edad, y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años".
 */

public class Imprimir {
  public static void main(String[] args) {
    System.out.printf("Primer método:\n");
    imprimeNombre("Ale");
    System.out.printf("Segundo método:\n");
    imprimeNombreYEdad("Ale", 18);
  }

  public static void imprimeNombre(String nombre) {
    System.out.printf("Mi nombre es: %s\n", nombre);
  }

  public static void imprimeNombreYEdad(String nombre, int edad) {
    System.out.printf("Me llamo %s y tengo %d años\n", nombre, edad);
  }
}
