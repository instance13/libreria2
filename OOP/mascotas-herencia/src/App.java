public class App {
    public static void main(String[] args) throws Exception {
        Perro perro = new Perro("nombrePerro", 2, "husky");
        Gato gato = new Gato("nombreGato", 3);

        System.out.println("");

        perro.ladrar();
        gato.dormir();

        // boolean b = gato instanceof Gato g;

        Object obj = new Gato();
        if (obj instanceof Gato g) {
            g.dormir();
        }    
    }
}
