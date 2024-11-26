import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {
        Liga liga = new Liga();
        Scanner sc = new Scanner(System.in);

        char opcion;
        do {
            System.out.print(
                    "---\n1.Crear jugador.\n2.Crear equipo.\n3.Asignar jugador a equipo.\n4.Mostrar lista de jugadores.\n5.Mostrar lista  de equipos.\n6.Salir\n---\n");
            opcion = sc.nextLine().charAt(0);

            switch (opcion) {
                case '1':
                    Equipo equipo = null;
                    System.out.print("Ingresa el nombre del jugador: ");
                    String nombre = sc.nextLine();
                    if (!liga.getEquipos().isEmpty()) {
                        liga.mostrarEquipos();
                        System.out.print("Ingresa un equipo: ");
                        int nombreEquipo = sc.nextLine();
                        int indice = liga.getEquipos().indexOf(nombreEquipo);
                        equipo = liga.getEquipos().get(indice);
                    }
                    liga.crearJugador(nombre, equipo);
                    break;
                case '2':
                    System.out.print("Ingresa el nombre del equipo que quieres crear: ");
                    String nombreEquipo = sc.nextLine();
                    liga.crearEquipo(nombreEquipo);
                    break;
                case '4':
                    liga.mostrarJugadores();
                    break;
                case '5':
                    liga.mostrarEquipos();
                    break;
                default:
                    break;
            }

        } while (opcion != '6');
    }
}
