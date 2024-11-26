import java.util.Scanner;

public class numdecimal {

  public static void main(String[] args) {
    float num1;
    Scanner mat = new Scanner(System.in);
    System.out.println("ingrese un numero decimal: ");
    num1 = mat.nextFloat();
    long roundedNum = Math.round(num1);

    System.out.println("el valor absoluto de " + num1 + "es: " + roundedNum);
    mat.close();

    Scanner escaner = new Scanner(System.in);
    System.out.println("Ingrese un numero positivo:");
    double num = escaner.nextDouble();
    double raizC = (num < 0) ? -1 : Math.sqrt(num);
    // double raizC = Math.sqrt(num);
    System.out.println(
        (raizC == -1) ? "El numero ingresado es negativo" : ("La raiz del numero ingresado es: " + raizC)); // ternario dentro de print :O

  }
}