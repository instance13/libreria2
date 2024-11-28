public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---\nColores primarios y sus códigos hexadecimales---\n");

        String[] colores = {
                "#FF0000", // ROJO
                "#FFFF00", // AMARILLO
                "#0000FF", // AZUL
                "#00FF00", // No es un color primario
                "#FFFFFF" // No es un color primario
        };

        for (String colorHex : colores) {
            Color color = ConvertidorColor.convertirValorHexadecimal(colorHex);
            if (color != null) {
                System.out.printf("%s%n", color.name()); // Returns the name of this enum constant, exactly as declared in its enum declaration!
            } else {
                System.out.printf("The color %s is not a primary color.%n", colorHex);
            }
        }

        System.out.printf("%s", Color.ROJO);
    }
}
