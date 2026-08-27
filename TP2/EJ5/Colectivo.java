package ej5;

public class Colectivo {
    private String modelo;
    private int numero_interno;
    private static int num = 0;
    public Colectivo() {
    
    }


    public Colectivo(String modelo, int numero_interno, int numero) {
        this.modelo = modelo;
        num++;
        this.numero_interno = numero_interno;
    }


}
