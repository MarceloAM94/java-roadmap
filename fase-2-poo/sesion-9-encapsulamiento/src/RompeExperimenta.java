public class RompeExperimenta {
    public static void main(String[] args) {
        Cuenta cuentaYape = new Cuenta(100.0);

        //cuentaYape.saldo = 5000.0; // PROHIBIDO, daria error en IntelliJ

        // Uso correcto
        cuentaYape.setSaldo(200.0);
        cuentaYape.setSaldo(-50.0);

        System.out.println("Tu saldo es: " + cuentaYape.getSaldo());
    }
}
