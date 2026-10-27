public class Mostrador {
    private String nombre;
    private static int turno_act = 0;

    public Mostrador(String nombre) {
        this.nombre = nombre;
    }

    public synchronized void atender(Persona p) throws InterruptedException{
        while(p.getNum_turno() != turno_act){
            System.out.println("Mande a " + p.getNombre() + " con turno " + p.getNum_turno() +" a hacer la fila (Se queria colar el wachin)");
            wait();
        }
        System.out.println("Atendi a " + p.getNombre() + " Con turno " + p.getNum_turno());

        Thread.sleep(1000);
        turno_act = (turno_act + 1) % 4; // el 4 es cantidad de personas esta hardcodeadisimo

        notifyAll();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTurno_act() {
        return turno_act;
    }
}
