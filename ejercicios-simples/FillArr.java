import java.util.*;

public class FillArr {
  public static void main(String[] args) {
    System.out.println("\033\143");
    Scanner sc = new Scanner(System.in);

    int size;
    do {
      System.out.print("Ingresa un tamaño para el array. Debe ser mayor a 0: ");
      size = sc.nextInt();
    } while (size <= 0);

    int[] arr = new int[size];

    System.out.print("Ingresa un número con el que quieras rellenar el array: ");
    int num = sc.nextInt();

    Arrays.fill(arr, num);
    System.out.println(Arrays.toString(arr));
  }
}
