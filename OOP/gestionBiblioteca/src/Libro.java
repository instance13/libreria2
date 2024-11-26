public class Libro extends itemBiblioteca {
  private String titulo;
  private String autor;
  private int numeroDePaginas;

  public void mostrarInformacion()
  {
    System.out.printf("---%nTitulo: %s%nAutor%s%nNumero de páginas: %d%n---%n", this.titulo, this.autor, this.numeroDePaginas);
  }

  @Override
  public void prestar() {
  }

  @Override
  public void devolver() {

  }

  @Override
  public void calcularMultas() {

  }
}
