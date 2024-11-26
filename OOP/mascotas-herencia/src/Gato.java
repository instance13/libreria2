public class Gato extends Animal {

  public Gato() {
    super();
  }

  public Gato(String nombre, int edad) {
    super(nombre, edad);
  }

  public void purr() {
    System.out.println("Purrrr.");
  };

  // ejemplo de polimorfismo
  @Override
  public void dormir() {
    super.dormir();
    this.purr();
  }
}
