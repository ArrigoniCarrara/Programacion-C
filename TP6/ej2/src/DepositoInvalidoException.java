public class DepositoInvalidoException extends RuntimeException {
    private double cantidad;

    public DepositoInvalidoException(String message, double cantidad) {
        super(message);
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }
}
