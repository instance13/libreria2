/*
Vuelve a realizar el ejercicio de la calculadora, pero esta vez crea un método llamado "menu()" que no reciba ningún parámetro y se encargue de generar la lógica de mostrar el menú de opciones y producir el bucle para seguir mostrando el menú hasta seleccionar la opción de "salir". Solicita dos números al usuario y realiza la operación matemática seleccionada, teniendo en cuenta las validaciones necesarias como la división por cero.
 */

import java.util.Scanner;

public class Calculadora2 {
  public static Scanner sc = new Scanner(System.in);

  public static int a;
  public static int b;

  public static void main(String[] args) {
    System.out.print("Ingresa el primer operando: ");
    a = sc.nextInt();
    System.out.print("Ingresa el según operando: ");
    b = sc.nextInt();

    menu();
    sc.close();
  }

  public static void menu() {
    int option;

    do {
      System.out.print("Ingresa una opción:\nSuma: 1\nResta: 2\nMultiplicación: 3\nDivisión: 4\nSalir: 5\n");
      option = sc.nextInt();
      sc.nextLine();

      switch (option) {
        case 1:
          System.out.printf("El resultado de la suma es: %d\n", suma(a, b));
          break;
        case 2:
          System.out.printf("El resultado de la resta es: %d\n", resta(a, b));
          break;
        case 3:
          System.out.printf("El resultado de la multiplicación es: %d\n", multiplicacion(a, b));
          break;
        case 4:
          if (b == 0) {
            System.out.printf("No es posible efectuar la división por cero.\n");
          } else {
            System.out.printf("El resultado de la división es: %.2f\n", division(a, b));
          }
          break;
        case 5:
          break;
        default:
          break;
      }

    } while (option != 5);
  }

  public static int suma(int a, int b) {
    return a + b;
  }

  public static int resta(int a, int b) {
    return a - b;
  }

  public static int multiplicacion(int a, int b) {
    return a * b;
  }

  public static double division(int a, int b) {
    return (double)a / (double)b;
  }
}
