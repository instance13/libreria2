import java.util.Scanner;

public class SistemaCalificacionSwitch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa tu nota: ");
    int opcion = sc.nextInt();

    String resultado = switch (opcion) {
      case 1 -> "Muy deficiente";
      case 2 -> "Deficiente";
      case 3 -> "Suficiente";
      case 4 -> "Notable";
      case 5 -> "Sobresaliente";
      default -> "Nota inválida";
    };
    System.out.printf("Su nota fue: %s", resultado);
    sc.close();
  }
}
