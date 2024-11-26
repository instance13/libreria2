import java.util.Scanner;

public class ElementoMaximo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer[] arr = new Integer[5];

    Integer max = 0;

    System.out.print("Ingrese un elemento para la posición 0: ");
    Integer num1 = sc.nextInt();
    arr[0] = num1;
    max = arr[0];

    System.out.print("Ingrese un elemento para la posición 1: ");
    Integer num2 = sc.nextInt();
    arr[1] = num2;

    if (isGreaterThan(arr[1], max)) {
      switchValues(arr[1], max);
      max = arr[1];
    }

    System.out.print("Ingrese un elemento para la posición 2: ");
    Integer num3 = sc.nextInt();
    arr[2] = num3;

    if (isGreaterThan(arr[2], max)) {
      switchValues(arr[2], max);
      max = arr[2];
    }

    System.out.print("Ingrese un elemento para la posición 3: ");
    Integer num4 = sc.nextInt();
    arr[3] = num4;

    if (isGreaterThan(arr[3], max)) {
      switchValues(arr[3], max);
      max = arr[3];
    }

    System.out.print("Ingrese un elemento para la posición 4: ");
    Integer num5 = sc.nextInt();
    arr[4] = num5;

    if (isGreaterThan(arr[4], max)) {
      switchValues(arr[4], max);
      max = arr[4];
    }

    sc.close();

    System.out.printf("Este es el número más grande: %d", max);
  }

  public static boolean isGreaterThan(Integer num1, Integer num2) {
    if (num1 > num2) {
      return true;
    }
    return false;
  }

  public static void switchValues(Integer num1, Integer num2) { // 1 y 2
    num1 = num1 + num2; // num1 = 3
    num2 = num1 - num2; // num2 = 1
    num1 = num1 - num2; // num1 = 2
  }
}
