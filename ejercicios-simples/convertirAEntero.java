import java.util.*;

public class convertirAEntero {
  public static void main(String[] args) {
    System.out.println("\033\143");
    Scanner sc = new Scanner(System.in);
    int resultado = 0;
    System.out.print("Ingrese un número: ");
    try {
      String numStr = sc.nextLine();
      resultado = Integer.parseInt(numStr);

      System.out.printf("El número en string convertido a entero es: %s", ((Object)resultado).getClass().getName());
    } catch (NumberFormatException e) {
      System.out.printf("No fue posible convertir a entero. El formato del número ingresado es incorrecto: \n%s",
          e.getMessage());
    }
    sc.close();
  }
}
