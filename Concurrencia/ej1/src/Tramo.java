public class Tramo {
    private String nombre;
    private int trenes = 0;
    private int direccionActual = -1; // -1 cuando no hay nadie

    private int turno = 0;
    private int[] esperando = {0, 0}; // contador esperando en direccion 0 y direccion 1

    public Tramo(String nombre) {
        this.nombre = nombre;
    }

    public synchronized void ocupar(Tren t) throws InterruptedException {
        int dirOpuesta;

        if (t.getDireccion() == 0) {
            dirOpuesta = 1;
        }else
            dirOpuesta = 0;

        esperando[t.getDireccion()]++;

        while ((trenes > 0 && direccionActual != t.getDireccion()) || (turno != t.getDireccion() && esperando[dirOpuesta] > 0)) {
            System.out.println("Tramo: El Tren " + t.getNombre() + " (Dir " + t.getDireccion() + ") espera...");
            wait();
        }

        esperando[t.getDireccion()]--;
        trenes++;
        direccionActual = t.getDireccion();

        System.out.println("--> Tramo: El Tren " + t.getNombre() + " (Dir " + t.getDireccion() + ") OCUPA el tramo " + nombre);
    }

    public synchronized void desocupar(Tren t) {
        System.out.println("<-- Tramo: El Tren " + t.getNombre() + " (Dir " + t.getDireccion() + ") LIBERA el tramo " + nombre);

        trenes--;
        if(trenes == 0) {
            direccionActual = -1;
        }

        if (t.getDireccion() == 0) {
            turno = 1;
        }else
            turno = 0;

        notifyAll();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isOcupada() {
        return direccionActual != -1;
    }

    public void setOcupada() {
        this.direccionActual = -1;
    }
}
