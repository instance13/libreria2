import java.util.*;

public class RandomRoot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa un número entre 1 y 30: ");
    int numeroLimite = sc.nextInt();

    while (!(numeroLimite >= 1 && numeroLimite <= 30)) {
      System.out.print("El número ingresado está fuera del rango. Inténtalo de nuevo: ");
      numeroLimite = sc.nextInt();
    }

    int numeroAleatorio = (int) (Math.floor(Math.random() * 30) + 1);

    double raizNumeroAleatorio = Math.sqrt(numeroAleatorio);

    System.out.printf("La raíz cuadrada del número aleatorio generado es: %f", raizNumeroAleatorio);

    boolean esPrimo = true;

    if (numeroAleatorio < 1) {
      esPrimo = false;
    }

    for (int i = 2; i * i <= numeroAleatorio; i++) {
      if (numeroAleatorio % i == 0) {
        esPrimo = false; // Encontramos un divisor
        break; // No necesitamos seguir verificando
      }
    }

    if (esPrimo) {
      System.out.println(numeroAleatorio + " es un número primo.");
    } else {
      System.out.println(numeroAleatorio + " no es un número primo.");
    }

    System.out.printf("El número aleatorio generado es: %d\n", numeroAleatorio);
    System.out.printf("La raíz cuadrada del número aleatorio es: %f", raizNumeroAleatorio);

    sc.close(); // Cerrar el escáner
  }
}
