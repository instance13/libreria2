import java.util.Random;

public class GeneradorContrasena {

  public static void main(String[] args) {
    int passwordLength = 16; 
    char[] password = new char[passwordLength];
    Random random = new Random();

    boolean hasUpperCase;
    boolean hasLowerCase;
    boolean hasDigit;

    do {
      hasUpperCase = false;
      hasLowerCase = false;
      hasDigit = false;

      for (int i = 0; i < password.length; i++) {
        int randomValue = random.nextInt(75) + 48; 
        password[i] = (char) randomValue;

        if (Character.isUpperCase(password[i])) {
          hasUpperCase = true;
        } else if (Character.isLowerCase(password[i])) {
          hasLowerCase = true;
        } else if (Character.isDigit(password[i])) {
          hasDigit = true;
        }
      }

    } while (!(hasUpperCase && hasLowerCase && hasDigit));

    String passwordString = new String(password);

    System.out.println("Generated Password: " + passwordString);
  }
}