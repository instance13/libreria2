import java.util.Scanner;

public class Ocurrencias {
  public static void main(String[] args) {
    // Character[] string = new Character[];

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa una frase de 50 caracteres: ");
    String frase = sc.nextLine();
    
    while (frase.length() < 50) {
      System.out.print("La frase ingresada debe ser de 50 caracteres. Inténtalo de nuevo: ");
      frase = sc.nextLine();
    }

    char[] fraseMayusculas = frase.toUpperCase().toCharArray(); // mayusculas

    System.out.print("Ingresa un caracter para buscar (case-insensitive): ");
    char caracter = sc.nextLine().charAt(0); // a

    // Convertir a mayúscula
    char caracterMayuscula = Character.toUpperCase(caracter); // A

    int counter = 0;

    for (Character c : fraseMayusculas) { // -> Usando wrapper class de char: Character | int -> Integer
      if (c.equals(caracterMayuscula)) { // ==
        counter++;
      }
    }

    for (char c : frase.toCharArray()) {
      System.out.printf("[%c]", c);
    }

    System.out.printf("\nEl número total de ocurrencias del caracter ingresado (%c) es: %d", caracter, counter);
    sc.close();
  }
}

// Aprender Java abre puertas al desarrollo de software.