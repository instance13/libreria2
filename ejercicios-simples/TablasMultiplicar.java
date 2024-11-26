import java.util.Scanner;

public class TablasMultiplicar {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Ingrese un numero entero: ");
    int numero = myScanner.nextInt();
    while (numero != 0) {
      for (int i = 1; i <= 10; i++) {
        System.out.printf(" %d X %d = %d\n", numero, i, numero * i);
      }
      System.out.println("Ingrese un numero entero");
      numero = myScanner.nextInt();
    }
    ;
    System.out.println("FIN");
  }
}
