public class Ejercicio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

int sumaTotal = 0;
int numeroIngresado;
String caracter;
boolean respuesta = true;

do{


System.out.println("Ingrese un numero: ");
numeroIngresado = sc.nextInt();

sumaTotal = sumaTotal + numeroIngresado;

System.out.print("Desea ingresar otro numero? s/n: ");
caracter = sc.next();



} while(caracter.equalsIgnoreCase("s"));

System.out.println("Suma total: " + sumaTotal);
}
  }
