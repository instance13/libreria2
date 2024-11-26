import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Liga {
  private List<Jugador> jugadores;
  private List<Equipo> equipos;
  private Scanner sc;

  public Liga() {
    this.jugadores = new ArrayList<>();
    this.equipos = new ArrayList<>();
  }

  public void mostrarEquipos() {
    if (equipos.isEmpty()) {
      System.out.println("No hay equipos.");
    } else {
      for (Equipo equipo : equipos) {
        System.out.printf("Equipo: %s\n", equipo.getNombre());
      }
    }
  }
  
  public void mostrarJugadores() {
    if (jugadores.isEmpty()) {
      System.out.println("No hay jugadores.");
    } else {
      for (Jugador jugador : jugadores) {
        System.out.printf("Nombre de jugador: %s\nEquipo: %s\n", jugador.getNombre(), (jugador.getEquipo())==null ? "No tiene equipo.":jugador.getEquipo().getNombre());
      }
    }
  }

  public void crearJugador(String nombre, Equipo equipo) {
    
    jugadores.add(new Jugador(nombre, equipo));
  }

  public void crearEquipo(String nombre) {
    equipos.add(new Equipo(nombre));
  }

  public List<Jugador> getJugadores() {
    return jugadores;
  }

  public List<Equipo> getEquipos() {
    return equipos;
  }
}
