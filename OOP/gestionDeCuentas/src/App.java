public class App {
    public static void main(String[] args) {
        CuentaBancaria cuentaPrincipal = new CuentaBancaria(5000);

        cuentaPrincipal.imprimirSaldoActual();

        try {
            cuentaPrincipal.retirar(1000); // retiro exitoso

            cuentaPrincipal.retirar(6000); // retiro fallido
        } catch (SaldoInsuficienteException e) {
            System.out.printf("Error: %s", e.getMessage());
        }
    }
}
