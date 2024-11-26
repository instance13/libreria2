public class Revista extends itemBiblioteca implements Catalogable{
  private int nroEdicion;
  public static int cantidadEjemplares = 10;
  private String nombreRevista;

  public Revista(int nroEdicion, String nombreRevista) {
    this.nroEdicion = nroEdicion;
    this.nombreRevista = nombreRevista;
  }

  public Revista() {
  }
  public int getNroEdicion() {
    return nroEdicion;
  }
  public void setNroEdicion(int nroEdicion) {
    this.nroEdicion = nroEdicion;
  }
  public String getNombreRevista() {
    return nombreRevista;
  }
  public void setNombreRevista(String nombreRevista) {
    this.nombreRevista = nombreRevista;
  }

  @Override
  public void prestar() {
  if (cantidadEjemplares <= 0) {
    System.out.println("Ah, F.");
  } else {
    cantidadEjemplares--;
  }
  }

  @Override
  public void devolver() {
    if (cantidadEjemplares > 10) {
      System.out.println("Ah, F...");
    } else {
      cantidadEjemplares++;
    }
  }

  @Override
  public void obtenerInformacion() {
    System.out.printf("Nombre de revista: %s%nNúmero de edición: %d%nCantidad de ejemplares: %d%n", this.nombreRevista,
        this.nroEdicion, cantidadEjemplares);
  }
  
  @Override
  public void calcularMultas() {
    System.out.println("Calculando multas.");
  }
}
