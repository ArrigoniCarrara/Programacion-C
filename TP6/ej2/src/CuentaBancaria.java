public class CuentaBancaria{
    private double saldo;
    private String titular;

    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double cantidad) throws ExtraccionInvalidaException, DepositoInvalidoException {
            if(cantidad > 0) {
                saldo = saldo + cantidad;
            }else  {
                throw new DepositoInvalidoException("La cantidad a depositar debe ser menor que 0", cantidad);
            }
    }

    public void extraer(double cantidad) throws ExtraccionInvalidaException, DepositoInvalidoException {
        if(cantidad <= saldo) {
            saldo = saldo - cantidad;
        }else{
            throw new ExtraccionInvalidaException("La cantidad a extraer debe ser menor al saldo disponible", cantidad, saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

}
