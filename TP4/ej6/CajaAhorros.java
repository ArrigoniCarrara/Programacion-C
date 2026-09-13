public class CajaAhorros extends CuentaBancaria {
	private int cantMaxMensual;
	private int extraccionesRealizadas;

	public CajaAhorros(String nombre, int cantMaxMensual) {
		super(nombre);
		this.cantMaxMensual = cantMaxMensual;
		this.extraccionesRealizadas = 0;
	}

	@Override
	public boolean PuedeExtraer(double cantidad) {
		return extraccionesRealizadas < cantMaxMensual;
	}

	@Override
	public void postExtraccion(){
		extraccionesRealizadas++;
	}
}
