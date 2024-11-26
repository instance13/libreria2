import java.util.Scanner;

public class Replace {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa una frase: ");
    String frase = sc.nextLine();

    String nuevaCadena = frase.replace(" ", "");

    System.out.printf("Frase sin espacios: %s, con longitud: %d", nuevaCadena,nuevaCadena.length());

    sc.close();
  }
}
