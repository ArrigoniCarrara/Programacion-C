import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mazo {
    private static Mazo instancia;
    private List<Personaje> personajes;
    private Random random;

    // Constructor privado para evitar instanciación externa
    private Mazo() {
        personajes = new ArrayList<>();
        random = new Random();
    }

    // Método estático para obtener la única instancia
    public static Mazo getInstance() {
        if (instancia == null) {
            instancia = new Mazo();
        }
        return instancia;
    }

    public void agregarPersonaje(Personaje p) {
        personajes.add(p);
    }

    // Selecciona un adversario al azar, asegurándose de que no sea él mismo
    public Personaje getAdversarioAleatorio(Personaje solicitante) {
        if (personajes.size() <= 1) {
            System.out.println("No hay suficientes adversarios en el mazo.");
            return null;
        }

        Personaje adversario = solicitante;
        while (adversario == solicitante) {
            int index = random.nextInt(personajes.size());
            adversario = personajes.get(index);
        }
        return adversario;
    }
}
