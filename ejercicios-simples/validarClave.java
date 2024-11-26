import java.util.Scanner;

public class validarClave {
public static void main(String[] args) {
Scanner myScan = new Scanner(System.in);

System.out.println("Ingrese su clave: ");
String clave = myScan.nextLine();
String mensajeError = "";
boolean longitud = true;
boolean mayMin =true;
boolean num = true;
boolean caracterEsp = true;


if (clave.length()<8) {
longitud = false;
mensajeError = mensajeError.concat(" 8 caracteres ");

};
if (!clave.chars().anyMatch(Character::isUpperCase) || !clave.chars().anyMatch(Character::isLowerCase)) {
mayMin = false;
if (mensajeError.length()!=0){
mensajeError = mensajeError.concat(",");
}
mensajeError = mensajeError.concat(" una letra mayúscula y una letra minúscula ");

};
if (!clave.chars().anyMatch(Character::isDigit)) {
num = false;
if (mensajeError.length()!=0){
mensajeError = mensajeError.concat(",");
}
mensajeError = mensajeError.concat(" un número ");
};
if (!clave.matches(".*[!@#$%^&*(),.\"?:{}|<>].*")){
caracterEsp = false;
if (mensajeError.length()!=0){
mensajeError = mensajeError.concat(",");
}
mensajeError = mensajeError.concat(" caracter especial ");
}



if (longitud && mayMin && num && caracterEsp ) {
System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
}else{
System.out.println("Contraseña no segura. Debe tener al menos" + mensajeError);
}

myScan.close();
}
}
