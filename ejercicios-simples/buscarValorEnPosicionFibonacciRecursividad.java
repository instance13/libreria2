/*
 * En esta actividad, te propongo un desafío adicional relacionado con la serie de buscarValorEnPosicionFibonacci. La tarea consiste en crear un programa que te permita ingresar la posición de un número en la serie de buscarValorEnPosicionFibonacci y, a continuación, mostrar el valor correspondiente a esa posición.
 * 
 * Tu objetivo es desarrollar un programa que sea capaz de calcular y mostrar el valor de la serie de buscarValorEnPosicionFibonacci para cualquier posición ingresada por el usuario. Este ejercicio te ayudará a consolidar tu comprensión sobre cómo generar y trabajar con la serie de buscarValorEnPosicionFibonacci. ¡Anímate a enfrentar este reto y sigue profundizando en tus habilidades de programación!
*/

import java.util.Scanner;

public class buscarValorEnPosicionFibonacciRecursividad {
  public static Scanner sc = new Scanner(System.in);
  public static int resultado;

  public static void main(String[] args) {
    System.out.print("Ingresa una posición: ");
    int posicion = sc.nextInt();

    if (posicion < 0) {
      System.out.println("Por favor, ingrese un número entero no negativo.");
    } else {
      System.out.printf("El número en la posición especificada es: %d", buscarValorEnPosicionFibonacci(posicion));
    }

    sc.close();
  }

  public static int buscarValorEnPosicionFibonacci(int posicion) {
    if (posicion == 0)
      return 0;
    if (posicion == 1)
      return 1;
    return buscarValorEnPosicionFibonacci(posicion - 1) + buscarValorEnPosicionFibonacci(posicion - 2);
  }
}
