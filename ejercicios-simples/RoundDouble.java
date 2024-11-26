import java.util.*;

public class RoundDouble {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa un número decimal para redondear: ");
    float numero = sc.nextFloat();

    System.out.printf("Este es el número redondeado %d", Math.round(numero));

    sc.close();
  }
}
