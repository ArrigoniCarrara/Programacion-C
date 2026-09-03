package ej3;

abstract public class CuentaBancaria {
	private String nombre;
	protected double saldo;
	
	public CuentaBancaria(String nombre) {
		this.nombre = nombre;
		this.saldo = 0;
	}
	
	abstract public void extraer(double cantidad);
	
	public void depositar(double cantidad) {
		   saldo += cantidad;
	}	
}
