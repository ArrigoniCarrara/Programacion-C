import java.util.ArrayList;

public class Estacion {
    private String nom;
    private ArrayList<Surtidor> surtidores = new ArrayList<>();

    public Estacion() {
    }

    public Estacion(String nom, ArrayList<Surtidor> surtidores) {
        this.nom = nom;
        this.surtidores = surtidores;
    }

    public int cantidad_surtidores(){
        return surtidores.size();
    }

    public int totalGasoil() {
        int total = 0;
        for (Surtidor s : surtidores) {
            total += s.getCantGasoil();
        }
        return total;
    }

    public int totalSuper() {
        int total = 0;
        for (Surtidor s : surtidores) {
            total += s.getCantSuper();
        }
        return total;
    }

    public int totalPremium() {
        int total = 0;
        for (Surtidor s : surtidores) {
            total += s.getCantPremium();
        }
        return total;
    }

    public Surtidor mejorSurtidorGasoil(){
         Surtidor mejor = null;
         for(Surtidor s: surtidores){
             if (mejor == null || s.getCantGasoil() > mejor.getCantGasoil()) {
                 mejor = s;
             }
         }
         return mejor;
    }

    public Surtidor mejorSurtidorSuper(){
        Surtidor mejor = null;
        for(Surtidor s: surtidores){
            if (mejor == null || s.getCantSuper() > mejor.getCantSuper()) {
                mejor = s;
            }
        }
        return mejor;
    }

    public Surtidor mejorSurtidorPremium(){
        Surtidor mejor = null;
        for(Surtidor s: surtidores){
            if (mejor == null || s.getCantPremium() > mejor.getCantPremium()) {
                mejor = s;
            }
        }
        return mejor;
    }

    public int cantlitrosVendidosEstacion(){
        int acum = 0;
        for (Surtidor s: surtidores){
                acum += s.getVentaGasoil() + s.getVentaSuper() + s.getVentaPremium();
        }
        return acum;
    }
}
