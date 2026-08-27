package ej5;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Colectivo> colectivos = new ArrayList<>();
    private ArrayList<Chofer> choferes = new ArrayList<>();
    
    public Empresa() {
    }

    public Empresa(ArrayList<Colectivo> colectivos, ArrayList<Chofer> choferes) {
        this.colectivos = colectivos;
        this.choferes = choferes;
    }
    
    public int chofer_sin_colectivo(){
        
        int cont = 0;
        
        for(Chofer chofer: choferes){
            if (chofer.getColectivo() == null)
                cont++;
            }
        
        return cont;
        }
    
    public int cantidad_colectivos(){
        return choferes.size();
        }
}
