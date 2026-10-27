import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tramo tramoNorte = new Tramo("Tramo 1 (Norte)");
        Tramo tramoCentro = new Tramo("Tramo 2 (Centro)");
        Tramo tramoSur = new Tramo("Tramo 3 (Sur)");

        // Rutas: Sentido 0 (Norte -> Sur) y Sentido 1 (Sur -> Norte)
        List<Tramo> rutaNorteASur = Arrays.asList(tramoNorte, tramoCentro, tramoSur);
        List<Tramo> rutaSurANorte = Arrays.asList(tramoSur, tramoCentro, tramoNorte);

        // Trenes en dirección 0 (Norte a Sur)
        Thread tren1 = new Thread(new Tren("Express N1", rutaNorteASur, 0));
        Thread tren2 = new Thread(new Tren("Carga N2", rutaNorteASur, 0));
        Thread tren3 = new Thread(new Tren("Pasajeros N3", rutaNorteASur, 0));

        // Trenes en dirección 1 (Sur a Norte)
        Thread tren4 = new Thread(new Tren("Rápido S1", rutaSurANorte, 1));
        Thread tren5 = new Thread(new Tren("Mercancías S2", rutaSurANorte, 1));
        Thread tren6 = new Thread(new Tren("Local S3", rutaSurANorte, 1));

        // Inicio simultáneo de los hilos
        tren1.start();
        tren4.start();
        tren2.start();
        tren5.start();
        tren3.start();
        tren6.start();
    }
}