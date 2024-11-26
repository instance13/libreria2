import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Oraciones {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int option = 0, i;
    String sentence = "", palabra = "", palabra2 = "";
    String[] aux, palabras;
    boolean vbool;

    do {
      System.out.println("Menú de opciones");

      System.out.println("1. " + (sentencc:\programming\c\pointers\Actividad4.javac:\programming\c\pointers\Actividad4.javae.isEmpty() ? "Crear oración" : "Borrar oración"));
      System.out.println("2. Cantidad de caracteres");
      System.out.println("3. Cantidad de palabras");
      System.out.println("4. Ordenadas alfabéticamente");
      System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
      System.out.println("6. Buscar palabra");
      System.out.println("7. Modificar palabra");
      System.out.println("8. Agregar contenido");
      System.out.println("9. Salir");
      System.out.print("Seleccione una opción: ");
      option = reader.nextInt();
      reader.nextLine();
      switch (option) {
        case 1:

          if (sentence.isEmpty()) {
            System.out.println("Crear una oracion:");
            sentence = reader.nextLine().trim();
          } else {
            System.out.println("Borrando oración");
            sentence = "";
          }
          break;
        case 2:
          System.out.println("La cantidad de caracteres es:" + sentence.length());
          break;
        case 3:
          System.out.println("La cantidad de palabras es:" + sentence.split(" ").length);
          break;
        case 4:
          aux = sentence.split(" ");
          Arrays.sort(aux);
          System.out.println("Palabras desc:" + Arrays.toString(aux));
          break;
        case 5:
          System.out.println("Ingrese un numero");
          int posicion = reader.nextInt() - 1;
          reader.nextLine();
          palabras = sentence.split(" ");
          if (posicion < palabras.length) {
            palabra = palabras[posicion];
            System.out.println("La palabra en la posición " + (posicion + 1) + " es " + palabra);
          } else {
            System.out.println("Número inválido. Intente nuevamente.");
          }
          break;
        case 6:
          System.out.println("Ingrese una palabra a buscas:");
          palabra = reader.nextLine().toLowerCase();
          palabras = sentence.split(" ");
          for (i = 0; i < palabras.length; i++) {
            if (palabras[i].toLowerCase().contains(palabra)) {
              System.out.println("La palabra es:" + palabras[i] + " y la posicion es:" + (i + 1));
              break;
            }
          }
          if (i == palabras.length) {
            System.out.println("No esta tu palabra solly");
          }
          break;
        case 7:
          do {
            System.out.println("Ingrese una palabra a modificar:");
            palabra = reader.nextLine().toLowerCase();
            vbool = sentence.contains(palabra);
            if (vbool) {
              System.out.println("Ingresa la nueva palabra a modificar");
              palabra2 = reader.nextLine();
              sentence.replaceFirst(palabra, palabra2);
            }
          } while (!vbool);
          System.out.println("La nueva oracion:" + sentence);
          break;
        case 8:
          System.out.print("Ingrese nuevo contenido a la oración: ");
          palabra = reader.nextLine();
          sentence = sentence.concat(" ").concat(palabra).trim();
          System.out.println("nueva oracion:" + sentence);
          break;
        case 9:
          System.out.println("chaitos chaitos");
          break;
        default:
          option = 10;
      }
    } while (option != 9);
    reader.close();
  }
}