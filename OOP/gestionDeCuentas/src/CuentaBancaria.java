public class CuentaBancaria {
  private double saldoActual;

  public CuentaBancaria(double saldoActual) {
    this.saldoActual = saldoActual;
  }

  public CuentaBancaria() {
  }

  public void retirar(double cantidadARetirar) throws SaldoInsuficienteException {
    if (this.saldoActual < cantidadARetirar) {
      System.out.printf("---%nEl saldo se mantiene igual debido a un retiro fallido. [!]%n%.2f%n---%n", this.getSaldoActual());
      throw new SaldoInsuficienteException(
        "El retiro fracasó. No se puede retirar una cantidad mayor al saldo actual.");
    } else {
      this.saldoActual -= cantidadARetirar;
      System.out.printf("Retiro exitoso de %.2f%n", cantidadARetirar);
      this.imprimirSaldoActual();
    }
  }

  public double getSaldoActual() {
    return saldoActual;
  }

  public void imprimirSaldoActual() {
    System.out.printf("| El saldo actual es: %.2f |%n", saldoActual);
  }
}