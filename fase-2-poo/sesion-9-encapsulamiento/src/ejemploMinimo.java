class Cuenta{
    private double saldo;

    Cuenta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo(){
        return this.saldo + 10000;
    }

    public void setSaldo(double nuevoSaldo){
        if(nuevoSaldo >= 0){
            this.saldo = nuevoSaldo;
        }else{
            System.out.println("Alerta: Intento de hackeo o saldo negativo bloqueado");
        }
    }
}

public class ejemploMinimo {
    public static void main(String[] args) {
        Cuenta cuentaYape = new Cuenta(100.0);

        // cuentaYape.saldo = 5000.0; // PROHIBIDO, daria error en IntelliJ

        // Uso correcto
        cuentaYape.setSaldo(200.0);
        cuentaYape.setSaldo(-50.0);

        System.out.println("Tu saldo es: " + cuentaYape.getSaldo());
    }
}
