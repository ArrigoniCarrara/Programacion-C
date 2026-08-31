import java.util.ArrayList;

public class Partido {
    private Equipo local;
    private Equipo visitante;
    private String fecha;
    private int goles_local;
    private int goles_visitante;
    private ArrayList<Jugador> goleadores = new ArrayList<>();

    public Partido() {
    }

    public Partido(Equipo local, Equipo visitante, String fecha, int goles_local, int goles_visitante, ArrayList<Jugador> goleadores) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.goles_local = goles_local;
        this.goles_visitante = goles_visitante;
        this.goleadores = goleadores;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public String getFecha() {
        return fecha;
    }

    public int getGoles_local() {
        return goles_local;
    }

    public int getGoles_visitante() {
        return goles_visitante;
    }

    public ArrayList<Jugador> getGoleadores() {
        return goleadores;
    }

    public void descripcion(){
        System.out.println("El resultado fue " + local.getNombre() + "( " + goles_local + "- " + goles_visitante + ") " + visitante.getNombre());
        System.out.println("Lista de goleadores:");
        for(Jugador j: goleadores){
            System.out.println(j.getNombre());
        }
    }
}
