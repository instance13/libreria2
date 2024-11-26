public class Animal {
  protected String nombre;
  protected int edad;

  public Animal() {
  }

  public Animal(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public void comer() {
    System.out.println("Tengo hambre, entonces como.");
  }

  public void dormir() {
    System.out.println("*Aplana el terreno*. Duerme :3.");
  }
}
