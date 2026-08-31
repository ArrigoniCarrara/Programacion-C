import java.util.ArrayList;

public class Torneo {
    private ArrayList<Equipo> equipos = new ArrayList<>();
    private ArrayList<Partido> partidos = new ArrayList<>();
    private static Torneo torneo = null;

    private Torneo() {
    }

    private Torneo(ArrayList<Equipo> equipos, ArrayList<Partido> partidos) {
        this.equipos = equipos;
        this.partidos = partidos;
    }

    public Torneo getInstancia(){
        if(torneo == null){
            torneo = new Torneo(null, null);
        }
        return torneo;
    }

    public void agregarEquipos(Equipo equipo){
        equipos.add(equipo);
    }

    public void agregarPartido(Partido partido){
        partidos.add(partido);
    }

    public void comparo_jugadores(Jugador jugador1, Jugador jugador2){

        float prom;
        if (jugador1.getCant_partidos() == 0)
            prom = 0;
        else
            prom = (float) jugador1.getGoles() /jugador1.getCant_partidos();

        System.out.println("El promedio es de " + prom);

        if(jugador1.getGoles() > jugador2.getGoles())
            System.out.println("El jugador " + jugador1.getNombre() + "tiene más goles");
        else if (jugador2.getGoles() > jugador1.getGoles())
                System.out.println("El jugador " + jugador2.getNombre() + "tiene más goles");
            else
                System.out.println("Los jugadores estan empatados en goles");
    }

    public void getPuntosEquipo(Equipo equipo){
        int puntos = 3 * equipo.getPartidos_ganados() + equipo.getPartidos_empatados();
        int partidos = equipo.getPartidos_empatados() + equipo.getPartidos_ganados() + equipo.getPartidos_perdidos();
        System.out.println("El puntaje de " + equipo.getNombre() + " es " + puntos + "pts y la cantidad de partidos es " + partidos);
    }

    public void getMayorPuntajeMayorGoleador() {
        Equipo mejor_puntaje = null;
        int mejor_puntos = 0;
        int pun_aux;
        Equipo mejor_goleador = null;

        for (Equipo e : equipos) {
            pun_aux = 3 * e.getPartidos_ganados() + e.getPartidos_empatados();

            if ( mejor_puntaje == null || pun_aux > mejor_puntos || pun_aux == mejor_puntos && e.getGoles_favor() > mejor_puntaje.getGoles_favor() || e.getGoles_favor() == mejor_puntaje.getGoles_favor() && e.getGoles_contra() < mejor_puntaje.getGoles_contra()) {
                mejor_puntaje = e;
                mejor_puntos = pun_aux;
            }

            if(mejor_goleador == null || e.getGoles_favor() >= mejor_goleador.getGoles_favor()){
                mejor_goleador = e;
            }
        }
        if(mejor_puntaje != null) {
            System.out.println("El equipo con más puntos es " + mejor_puntaje.getNombre());
            System.out.println("El equipo con más goles es " + mejor_goleador.getNombre());
        }
    }
}


