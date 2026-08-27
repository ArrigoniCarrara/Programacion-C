package ej5;

public class Categoria {
    private String nombre_cat;
    private double sueldo;
    
    public Categoria() {
    }

    public Categoria(String nombre_cat, double sueldo) {
        this.nombre_cat = nombre_cat;
        this.sueldo = sueldo;
    }

    public double getSueldo(){
        return sueldo;
        }
}
