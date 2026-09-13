public class CuentaCorriente extends CuentaBancaria {
	private double tope;

	public CuentaCorriente(String nombre, double tope) {
		super(nombre);
		this.tope = tope;
	}

	@Override
	public boolean PuedeExtraer(double cantidad) {
		return cantidad <= (saldo + tope);
	}

	@Override
	public void postExtraccion() {}
}
