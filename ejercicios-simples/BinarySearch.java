import java.util.Scanner;
import java.util.Arrays;

// El programa debe imprimir el arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el índice del valor buscado si está presente en el arreglo.

public class BinarySearch {
  public static void main(String[] args) {
    System.out.println("\033\143");
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++) {
      System.out.printf("Ingresa un número para la posición %d: ", i);
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    System.out.print("Ingresa un valor a buscar: ");
    int valorObjetivo = sc.nextInt();
    int indexValorObjetivo = Arrays.binarySearch(arr, valorObjetivo);

    if (indexValorObjetivo < 0) {
      System.out.printf("El valor ingresado no existe en el array: %d", indexValorObjetivo);
    } else {
      System.out.printf("Este es el índice del valor ingresado: %d", indexValorObjetivo);
    }

    sc.close();
  }
}
