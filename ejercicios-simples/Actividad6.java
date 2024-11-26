public class Actividad6 {
public static void main(String[] args) {
String []palabras = {"Esto","es","una","oración","en", "Java"};
String oracion = "";
for (int i = 0; i < palabras.length; i++) {
if (i == 0){
oracion = palabras[i];
} else {
oracion = oracion.concat(" "+palabras[i]);
}
}
System.out.println("La oración resultante es: "+oracion);

}
}