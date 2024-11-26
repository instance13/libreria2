// Escribe un programa que recorra un array de enteros y lo invierta, es decir, que el primer elemento se convierta en el último y viceversa, luego imprime el array resultante por consola. El tamaño y los números a contener pueden ser de tu elección.

// IMPORTANTE: Debes invertir de forma permanente el orden de los elementos. Analiza si necesitas hacer uso de **elementos auxiliares** para concluir el ejercicio.

import java.util.Scanner;

public class InvertirArray {
  public static void main(String[] args) {
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < arr.length; i++) {
      System.out.printf("Ingresa un número en la posición %d: ", i);
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[(arr.length - 1) - i];
      arr[(arr.length - 1) - i] = temp;
    }
    
    System.err.println("Array invertida:");
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("[%d]", arr[i]);
    }

    sc.close();
  }
}
