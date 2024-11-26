// Área del cuadrado=lado×lado
// Área de un círculo=π r²
// área triángulo=(b×h)/2

import java.util.Scanner;

public class FiguraGeometrica {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();
    String result = switch(option) {
      case 1 -> {
        System.out.print("Ingresa el valor del radio: ");
        double radio = sc.nextDouble();
        double op = Math.PI * Math.pow(radio, 2);
        String val = "El resultado fue: " + op;
        yield val;
      }
      case 2 -> {
        System.out.print("Ingresa la longitud de un lado del cuadrado: ");
        int lado = sc.nextInt();
        double op = lado*lado;
        yield "El resultado fue: " + result;
      }
      case 3 -> {
        System.out.print("Ingresa la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = sc.nextDouble();
        double op = (base*altura)/2;
        yield "El resultado fue: " + result;
      }
      default -> "Opción inválida."
    }
    System.out.print("El resultado del área es: " + result);
  }
}
