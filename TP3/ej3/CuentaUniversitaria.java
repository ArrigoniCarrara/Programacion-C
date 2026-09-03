package ej3;

public class CuentaUniversitaria extends CuentaBancaria{
	private String nombre;
	private final double max = 1000;
	
	public CuentaUniversitaria(String nombre) {
		super(nombre);
	}
	
	public void extraer(double cantidad){
		if(cantidad <= max && saldo >= cantidad){
			saldo -= cantidad;
		}
	}
}
