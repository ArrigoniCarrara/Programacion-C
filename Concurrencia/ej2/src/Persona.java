public class Persona implements Runnable{
    private String nombre;
    private int num_turno;
    private Mostrador m;

    public Persona(String nombre, int num_turno, Mostrador m) {
        this.nombre = nombre;
        this.num_turno = num_turno;
        this.m = m;
    }


    @Override
    public void run() {
        try {

            for (int i = 1; i <= 5; i++) {
                System.out.println(nombre + " va a buscar el mostrador (Vuelta " + i + ")");
                m.atender(this);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Error al atender a " + nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_turno() {
        return num_turno;
    }

    public void setNum_turno(int num_turno) {
        this.num_turno = num_turno;
    }
}
