import java.util.Random;
import java.util.Scanner;

public class PromedioCalificacion {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    System.out.printf("Ingresa el número de calificaciones para analizar: ");
    int cantidadCalificaciones = sc.nextInt();

    if (cantidadCalificaciones < 0) {
      cantidadCalificaciones = Math.abs(cantidadCalificaciones);
    }

    String[] calificaciones = new String[cantidadCalificaciones];

    for (int i = 0; i < calificaciones.length; i++) {
      calificaciones[i] = String.valueOf(random.nextDouble() * 10); // Scale to 0-10
    }

    double[] desaprobado = new double[cantidadCalificaciones];
    double[] aprobado = new double[cantidadCalificaciones];
    double[] excelente = new double[cantidadCalificaciones];

    int countDesaprobado = 0, countAprobado = 0, countExcelente = 0;


    for (String calificacion : calificaciones) {
      double toDouble = Double.parseDouble(calificacion);

      if (toDouble < 4) {
        desaprobado[countDesaprobado++] = toDouble;
      } else if (toDouble >= 4 && toDouble < 10) {
        aprobado[countAprobado++] = toDouble;
      } else if (toDouble >= 10) {
        excelente[countExcelente++] = toDouble;
      }
    }

    double promedioOriginal = calcularPromedio(calificaciones);
    double promedioDesaprobado = calcularPromedio(desaprobado, countDesaprobado);
    double promedioAprobado = calcularPromedio(aprobado, countAprobado);
    double promedioExcelente = calcularPromedio(excelente, countExcelente);

    System.out.printf("Promedio del arreglo original: %.2f%n", promedioOriginal);
    System.out.printf("Promedio de desaprobados: %.2f%n", promedioDesaprobado);
    System.out.printf("Promedio de aprobados: %.2f%n", promedioAprobado);
    System.out.printf("Promedio de excelentes: %.2f%n", promedioExcelente);

    printArr(calificaciones);
    printArr(excelente);
    printArr(aprobado);
    printArr(desaprobado);
    sc.close();
  }

  private static double calcularPromedio(String[] calificaciones) {
    double suma = 0;
    for (String calificacion : calificaciones) {
      suma += Double.parseDouble(calificacion);
    }
    return suma / calificaciones.length;
  }

  private static double calcularPromedio(double[] calificaciones, int count) {
    if (count == 0)
      return 0;

    double suma = 0;
    for (int i = 0; i < count; i++) {
      suma += calificaciones[i];
    }
    return suma / count;
  }

  private static void printArr(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("[%s]", arr[i]);
    }
    System.out.println();
  }

  private static void printArr(double[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("[%.2f]", arr[i]);
    }
    System.out.println();
  }
}