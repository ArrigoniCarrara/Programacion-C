import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private int partidos_ganados;
    private int partidos_empatados;
    private int partidos_perdidos;
    private int goles_favor;
    private int goles_contra;

    public Equipo() {
    }

    public Equipo(String nombre, ArrayList<Jugador> jugadores, int partidos_ganados, int partidos_empatados, int partidos_perdidos, int goles_favor, int goles_contra) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.partidos_ganados = partidos_ganados;
        this.partidos_empatados = partidos_empatados;
        this.partidos_perdidos = partidos_perdidos;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public int getPartidos_ganados() {
        return partidos_ganados;
    }

    public int getPartidos_empatados() {
        return partidos_empatados;
    }

    public int getPartidos_perdidos() {
        return partidos_perdidos;
    }

    public int getGoles_favor() {
        return goles_favor;
    }

    public int getGoles_contra() {
        return goles_contra;
    }
}
