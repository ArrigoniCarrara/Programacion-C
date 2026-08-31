import java.lang.reflect.Constructor;// MAIN PARA PROBAR CON DATOS. NO TRATES DE ENTERDERLO, DISFRUTALO
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Constructor<Torneo> constructor = Torneo.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Torneo torneo = constructor.newInstance();// la IA que use para que cree muchas instancias no uso la funcion getInstancia (IGNORAR)

        String[] nombresEquipos = {
                "River Plate", "Boca Juniors", "Independiente", "Racing Club",
                "San Lorenzo", "Huracán", "Estudiantes", "Gimnasia", "Banfield",
                "Lanús"
        };

        ArrayList<Equipo> equipos = new ArrayList<>();
        ArrayList<Partido> partidos = new ArrayList<>();

        for (int i = 0; i < nombresEquipos.length; i++) {
            ArrayList<Jugador> plantel = new ArrayList<>();
            for (int j = 1; j <= 11; j++) {
                Jugador jugador = new Jugador(
                        nombresEquipos[i] + " - Jugador " + j,
                        1995 + ((i + j) % 15),
                        j,
                        (j % 4) + 1,
                        8 + ((i * 3 + j) % 12),
                        (i + j) % 9
                );
                plantel.add(jugador);
            }

            Equipo equipo = new Equipo(
                    nombresEquipos[i],
                    plantel,
                    (i % 5),
                    (i % 3),
                    (i % 2),
                    12 + i * 4,
                    10 + i * 3
            );

            equipos.add(equipo);
            torneo.agregarEquipos(equipo);
        }

        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                Equipo local = equipos.get(i);
                Equipo visitante = equipos.get(j);

                int golesLocal = (i * 2 + j) % 5;
                int golesVisitante = (j * 3 + i) % 4;

                ArrayList<Jugador> goleadores = new ArrayList<>();
                for (int k = 0; k < 3; k++) {
                    int indice = (i + j + k) % local.getJugadores().size();
                    if ((i + j + k) % 2 == 0) {
                        goleadores.add(local.getJugadores().get(indice));
                    }
                }

                for (int k = 0; k < 2; k++) {
                    int indice = (i + (2 * j) + k) % visitante.getJugadores().size();
                    if ((i + j + k) % 3 == 0) {
                        goleadores.add(visitante.getJugadores().get(indice));
                    }
                }

                Partido partido = new Partido(
                        local,
                        visitante,
                        "2026-08-31",
                        golesLocal,
                        golesVisitante,
                        goleadores
                );

                partidos.add(partido);
                torneo.agregarPartido(partido);
            }
        }

        System.out.println("Torneo creado con " + equipos.size() + " equipos.");
        System.out.println("Cada equipo juega " + (equipos.size() - 1) + " partidos.");
        System.out.println("Total de partidos cargados: " + partidos.size());

        for (Equipo equipo : equipos) {
            System.out.println("- " + equipo.getNombre() + " | jugadores: " + equipo.getJugadores().size());
            torneo.getPuntosEquipo(equipo);
        }

        for (Partido partido : partidos) {
            partido.descripcion();
        }

        Jugador jugador1 = new Jugador("Jugador A", 1998, 7, 1, 12, 8);
        Jugador jugador2 = new Jugador("Jugador B", 1999, 10, 2, 12, 5);
        torneo.comparo_jugadores(jugador1, jugador2);


        torneo.getMayorPuntajeMayorGoleador();
    }
}
