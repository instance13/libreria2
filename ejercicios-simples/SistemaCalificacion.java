// En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar un número entre 0 y 100. Luego, el programa validará el número ingresado y mostrará la calificación correspondiente según la siguiente escala:

// Si la puntuación está entre 90 y 100, se mostrará "A".
// Si la puntuación está entre 80 y 89, se mostrará "B".
// Si la puntuación está entre 70 y 79, se mostrará "C".
// Si la puntuación está entre 60 y 69, se mostrará "D".
// Si la puntuación es menor a 60, se mostrará "F".
// Si el usuario ingresa un número que no está dentro del rango establecido (es decir, fuera del intervalo de 0 a 100), el programa debe informar al usuario que el número ingresado está fuera del rango válido.
// El programa mostrará en la consola el valor de la calificación obtenida.
// Realiza varias pruebas de tu programa, para asegurarte que la lógica implementada sea la correcta. 

import java.util.Scanner;

public class SistemaCalificacion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese su calificación: ");
    int calificacion = sc.nextInt();

    if (calificacion >= 0 && calificacion <= 100) {
      if (calificacion >= 90 && calificacion <= 100) {
        System.out.println("A");
      } else if (calificacion >= 80 && calificacion <= 89) {
        System.out.println("B");
      } else if (calificacion >= 70 && calificacion <= 79) {
        System.out.println("C");
      } else if (calificacion >= 60 && calificacion <= 69) {
        System.out.println("D");
      } else if (calificacion < 60 && calificacion >= 0) {
        System.out.println("F");
      }
    } else {
      System.out.printf("La calificación está fuera del rango válido: %d.", calificacion);
    }
    sc.close();
  }
}
