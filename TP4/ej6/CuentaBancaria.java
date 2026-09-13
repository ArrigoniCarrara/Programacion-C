abstract public class CuentaBancaria {
	private String nombre;
	protected double saldo;
	
	public CuentaBancaria(String nombre) {
		this.nombre = nombre;
		this.saldo = 0;
	}
	
	public void extraer(double cantidad){
		if(PuedeExtraer(cantidad)){
			saldo-=cantidad;
			postExtraccion(); // Hook 
		}
	}

	public abstract boolean PuedeExtraer(double cantidad);

	public abstract void postExtraccion();

	public void depositar(double cantidad) {
		   saldo += cantidad;
	}	
}
