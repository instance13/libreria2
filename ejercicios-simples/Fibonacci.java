
// objetivo: ingresar la posición de un número en la serie de Fibonacci y mostrar el valor correspondiente a esa posición.

import java.util.*;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa la posición de un número en la serie de Fibonacci: ");
    int userOption = sc.nextInt();

    while (userOption < 0) {
      System.out.print("Ingresa la posición de un número en la serie de Fibonacci. El valor debe ser positivo: ");
      userOption = sc.nextInt();
    }

    long fib = 0;
    if (userOption < 0) {
      System.out.println("Por favor, ingrese un número entero no negativo.");
    } else {
      long a = 0; // Fibonacci(0)
      long b = 1; // Fibonacci(1)
      int i = 2;
      while (i <= userOption) {
        fib = a + b; // Fibonacci(i) = Fibonacci(i-1) + Fibonacci(i-2)
        a = b; // Mover a a la siguiente posición
        b = fib; // Mover b a la siguiente posición
        i++;
      }

      // Para las posiciones 0 y 1
      // fib = userOption == 0 ? a : (userOption == 1 ? b : 0);

      if (userOption == 0) {
        fib = 0;
      } else if (userOption == 1) {
        fib = 1;
      }

      System.out.printf("Este es el número en la posición especificada: %d", fib);
    }
    sc.close();
  }
}
