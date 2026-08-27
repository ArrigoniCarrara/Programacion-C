package ej5;

public class Chofer {
    private Categoria categoria;
    private Domicilio domicilio;
    private String nombre;
    private Colectivo colectivo;
    public Chofer() {
    }

    public Chofer(Categoria categoria, Domicilio domicilio, String nombre, Colectivo colectivo) {
        this.categoria = categoria;
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.colectivo = colectivo;
    }

    public double getSueldo(){
           
            return categoria.getSueldo();
        
        }
    
    public void setColectivo(Colectivo colectivo){
        
        this.colectivo = colectivo;
        
        }
    
    public Colectivo getColectivo(){
        return colectivo;
        }
    
    public void desvincularColectivo(){
        
        this.colectivo = null;
        
        }
    
    public Domicilio getDomicilio(){
        return domicilio;
        }
    
}
