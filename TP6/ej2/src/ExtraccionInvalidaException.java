public class ExtraccionInvalidaException extends RuntimeException {
    double cantidad;
    double saldoact;
    public ExtraccionInvalidaException(String message, double cantidad, double saldoact) {
        super(message);
        this.cantidad = cantidad;
        this.saldoact = saldoact;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getSaldoact() {
        return saldoact;
    }
}
