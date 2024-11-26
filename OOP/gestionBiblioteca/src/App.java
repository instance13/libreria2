public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Gestión de biblioteca ---");

        Revista revista1 = new Revista(1, "Revista número 1");

        revista1.obtenerInformacion();
        revista1.prestar();
        revista1.obtenerInformacion();
        revista1.devolver();
        revista1.obtenerInformacion();
    }
}
