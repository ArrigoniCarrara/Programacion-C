public class CuentaUniversitaria extends CuentaBancaria {
	private static final double MAX_DIARIO = 1000;

	public CuentaUniversitaria(String nombre) {
		super(nombre);
	}

	@Override
	public boolean PuedeExtraer(double cantidad) {
		return cantidad <= MAX_DIARIO && saldo >= cantidad;
	}

	@Override
	public void postExtraccion() {}
}
