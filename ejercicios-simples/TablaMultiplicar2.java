import java.util.Scanner;

public class TablaMultiplicar2 {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int[] numeros = new int[3];

    // Fill the array with numbers
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = pedirNumero(); // Store each number in the array
    }

    imprimirTabla(numeros);
  }

  public static int pedirNumero() {
    System.out.print("Ingrese un numero: ");
    return sc.nextInt();
  }

  public static void imprimirTabla(int[] numeros) {
    for (int i = 0; i < numeros.length; i++) { // Iterate through all numbers
      System.out.printf("--- Tabla del %d ---\n", numeros[i]); // Print table header
      for (int j = 1; j <= 10; j++) {
        System.out.printf("%d x %d = %d\n", numeros[i], j, (numeros[i] * j)); // Correct multiplication
      }
    }
  }
}