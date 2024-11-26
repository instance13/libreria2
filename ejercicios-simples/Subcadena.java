import java.util.Scanner;

public class Subcadena {
  public static void main(String[] args) { // psv
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa una frase: ");
    String frase = sc.nextLine();

    System.out.print("Ingresa el primer índice: ");
    int indice1 = sc.nextInt();
    System.out.print("Ingresa el segundo índice: ");
    int indice2 = sc.nextInt();

    while (indice1 > indice2) {
      System.out.print("Ingresa el primer índice de nuevo. Recuerda que debe ser menor al segundo índice: ");
      indice1 = sc.nextInt();
    }

    String subcadena = frase.substring(indice1, indice2);
    System.out.printf("Esta es la subcadena resultante: %s.", subcadena);

    sc.close();
  }
}
