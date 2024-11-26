import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
/*int [] enteros = {77,1000,1997};
int [] masEnteros = new int [2];
Scanner scan = new Scanner(System.in);
System.out.println("Ingrese un número: ");
int cuarto = scan.nextInt();
System.out.println("Ingrese otro número: ");
int quinto = scan.nextInt();
int[] concatenado = new int[masEnteros.length + enteros.length];*/


Integer[] arr1 = {1, 2, 3};
Integer[] arr2 = {4, 5, 6};

// Combining two arrays
List<Integer> combined = Arrays.asList(arr1, arr2).stream()
.flatMap(Arrays::stream)
.toList(); // Java 16+ method
Object[] arrayMerged = combined.toArray();

/*System.out.println(combined);*/
System.out.println(Arrays.toString(arrayMerged));
}
} 
