/*
 * Partiendo con la base del ejercicio de la calculadora: cambia el código de la división para que permita realizar una división por cero pero utiliza un bloque try catch para atrapar la excepción.
 */

import java.util.Scanner;

public class calculadora {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Este programa realiza una operación aritmética simple entre 2 números (+, -, * y /)");
    System.out.print("Ingresa el primer número: ");
    int num1 = teclado.nextInt();
    System.out.print("Ingresa el segundo número: ");
    int num2 = teclado.nextInt();
    System.out.println(
        "Hay 4 operaciones aritméticas disponibles:\n 1 - Suma\n 2 - Resta\n 3 - Multiplicación\n 4 - División");
    System.out.print("Ingrese el número de la operación que desea realizar: ");
    int operar = teclado.nextInt();
    float resultadoOp;p
    try {
      resultadoOp = (operar == 1) ? (num1 + num2)
          : (operar == 2) ? (num1 - num2)
              : (operar == 3) ? (num1 * num2) : (num1 / num2);
      System.out.println("El resultado es: " + resultadoOp);
    } catch (ArithmeticException e) {
      System.out.println("Error: No es posible dividir por 0.");
    }
    teclado.close();
  }
}