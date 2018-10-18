package banco;

public abstract class Cuenta {
    private String numCuenta;

    private double saldo;

    public Cuenta(String numCuenta, double saldo) {
        this.numCuenta = numCuenta;

        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Cuenta{" +
                "numCuenta='" + numCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

