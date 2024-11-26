import java.util.Scanner;

class calc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int resultado;
    int opcion;

    do {
      System.out.print("Ingresa el primer operando: ");
      int operando1 = sc.nextInt();
      System.out.print("Ingresa el segundo operando: ");
      int operando2 = sc.nextInt();

      System.out.printf("Ingresa una opción \n1 - suma\n2 - resta\n3 - multiplicación\n4 - división\n5 - salir\n");
      opcion = sc.nextInt();

      resultado = (opcion == 1) ? (operando1 + operando2)
          : (opcion == 2) ? (operando1 - operando2)
              : (opcion == 3) ? (operando1 * operando2)
                  : (opcion == 4 && operando2 != 0) ? (operando1 / operando2) : -99; 

      if (resultado == -99 && opcion == 4) {
        System.out.println("No fue posible realizar la división. El segundo operando fue 0.");
      } else if (opcion >= 1 && opcion <= 4) {
        System.out.printf("El resultado de la operación es: %d%n", resultado);
      }

    } while (opcion != 5); 

    sc.close();
  }
}