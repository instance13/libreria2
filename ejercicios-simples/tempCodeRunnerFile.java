
// Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un bucle while. La contraseña correcta es "secreto". Continuará pidiéndote que ingreses la contraseña hasta que sea correcta.
import java.util.Scanner;

public class ValidacionContrasena {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String contrasena = "secreto";

    System.out.print("Ingresa tu contraseña: ");
    String contrasenaUsuario = sc.nextLine();

    do {
      System.out.print("La contraseña ingresada anteriormente fue incorrecta. Ingresa tu contraseña de nuevo: ");
      contrasenaUsuario = sc.nextLine();
    } while ((!contrasenaUsuario.equals(contrasena)));
    sc.close();
  }
}
