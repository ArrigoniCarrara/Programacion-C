import java.util.List;
public class Tren implements Runnable{
    private String nombre;
    private List<Tramo> ruta;
    private int direccion;

    public Tren(String nombre, List<Tramo> ruta, int direccion) {
        this.nombre = nombre;
        this.ruta = ruta;
        this.direccion = direccion;
    }

    @Override
    public void run() {
        try {
            for (Tramo tramo : ruta) {
                System.out.println(nombre + " solicita ingresar a " + tramo.getNombre() + " (Dir " + direccion + ")");
                tramo.ocupar(this);

                // Simula el tiempo que tarda en recorrer el tramo actual
                Thread.sleep(1500);

                tramo.desocupar(this);
            }
            System.out.println("=== " + nombre + " COMPLETÓ SU RECORRIDO ===");
        } catch (InterruptedException e) {
            System.out.println("Error de interrupción en " + nombre);
            Thread.currentThread().interrupt();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
}
