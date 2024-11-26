import java.util.InputMismatchException;
import java.util.Scanner;

class ConversionTemperatura {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    float temperatura = 0;

    try {
      System.out.print("Ingrese la temperatura: ");
      temperatura = scan.nextFloat();
      System.out.print("Ingrese la unidad de medida (C/F): ");
      char unidadDeMedida = scan.next().toUpperCase().charAt(0);
      float nuevaTemperatura = 0;

      switch (unidadDeMedida) {
        case 'C':
          nuevaTemperatura = (temperatura * 9 / 5) + 32;
          System.out.println(
              temperatura + " grados Celsius equivale a " + nuevaTemperatura + " grados Fahrenheit.");
          break;
        case 'F':
          nuevaTemperatura = (temperatura - 32) * 5 / 9;
          System.out.println(
              temperatura + " grados Fahrenheit equivale a " + nuevaTemperatura + " grados Celsius.");
          break;

        default:
          System.out.println("Error: Unidad de medida no válida.");
          break;
      }

    } catch (InputMismatchException e) {
      System.out.println("Error: Temperatura no válida. " + e.getMessage());
    }

    scan.close();
  }
}
