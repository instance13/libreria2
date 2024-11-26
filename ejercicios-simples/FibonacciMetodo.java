/*
 * En esta actividad, te propongo un desafío adicional relacionado con la serie de Fibonacci. La tarea consiste en crear un programa que te permita ingresar la posición de un número en la serie de Fibonacci y, a continuación, mostrar el valor correspondiente a esa posición.
 * 
 * Tu objetivo es desarrollar un programa que sea capaz de calcular y mostrar el valor de la serie de Fibonacci para cualquier posición ingresada por el usuario. Este ejercicio te ayudará a consolidar tu comprensión sobre cómo generar y trabajar con la serie de Fibonacci. ¡Anímate a enfrentar este reto y sigue profundizando en tus habilidades de programación!
*/

import java.util.Scanner;

public class FibonacciMetodo {
  public static int posicion;
  public static Scanner sc = new Scanner(System.in);
  public static int resultado;

  public static void main(String[] args) {
    System.out.print("Ingresa una posición: ");
    posicion = sc.nextInt();

    if (posicion < 0) {
      System.out.println("Por favor, ingrese un número entero no negativo.");
    } else {
      buscarValorEnPosicionFibonacci();
    }

    sc.close();
  }

  public static void buscarValorEnPosicionFibonacci() {
    long fib = 0;

    long a = 0; // Fibonacci(0)
    long b = 1; // Fibonacci(1)
    int i = 2;
    while (i <= posicion) {
      fib = a + b; // Fibonacci(i) = Fibonacci(i-1) + Fibonacci(i-2)
      a = b; // Mover a a la siguiente posición
      b = fib; // Mover b a la siguiente posición
      i++;
    }
    resultado = i;
  }
}
