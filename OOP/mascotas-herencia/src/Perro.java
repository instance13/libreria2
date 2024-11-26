public class Perro extends Animal {
  private String raza; // protected si existieran clases hijas de perro

  public Perro() {
  }

  public Perro(String nombre, int edad, String raza) {
    super(nombre, edad);
    this.raza = raza;
  }
  
  public void ladrar() {
    System.out.println("Woof!");
  }

  @Override
  public void comer() {
    super.comer();
    ladrar();
  }
}
