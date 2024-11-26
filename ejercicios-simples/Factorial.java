import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number;
    long factorial = 1;

    do {
      System.out.print("Ingrese un número entero no negativo para calcular su factorial: ");
      number = scanner.nextInt();
    } while (number < 0);

    int i = 1;
    do {
      factorial *= i;
      i++;
    } while (i <= number);

    System.out.println("El factorial de " + number + " es: " + factorial);

    scanner.close();
  }
}