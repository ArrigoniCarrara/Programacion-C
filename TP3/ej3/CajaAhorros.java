package ej3;

public class CajaAhorros extends CuentaBancaria {
	private String nombre;
	private double saldo;
	private double cant_max;
	
	
	public CajaAhorros(String nombre, double cant_max){
		super(nombre);
		this.cant_max = cant_max;
		
	}
	
	@Override
	public void extraer(double cantidad){
		if(cant_max > 0) {
			if(cantidad <= saldo) {
				saldo -= cantidad;
				cant_max--;
			}
		}
	}
	

}
