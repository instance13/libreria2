import java.util.Scanner;

public class Reemplazo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa una frase: ");
    String frase = sc.nextLine();

    System.out.print("Ingresa el caracter que quieres reemplazar: ");
    char char1 = sc.next().charAt(0);

    System.out.print("Ingresa el caracter que reemplazará el anterior: ");
    char char2 = sc.next().charAt(0);

    if (frase.indexOf(char1) != -1) {
      String nuevaCadena = frase.replace(char1, char2);
      System.out.printf("Esta es la nueva cadena: %s", nuevaCadena);
    } else {
      System.out.print("El caracter que quieres reemplazar no se encuentra en la frase.");
    }
    sc.close();
  }
}
