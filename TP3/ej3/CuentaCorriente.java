package ej3;

public class CuentaCorriente extends CuentaBancaria{
	private String nombre;
	private double tope;
	
	public CuentaCorriente(String nombre, double tope) {
		super(nombre);
		this.tope = tope;
	}
	
	@Override
 	public void extraer(double cantidad){
		if(cantidad <= saldo){
			saldo -= cantidad;
		}
		else{
			if(tope + saldo != 0){
				saldo -= tope - saldo;
			}
		}
	}
	
	}
