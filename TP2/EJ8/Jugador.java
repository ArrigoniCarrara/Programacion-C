public class Jugador {
    private String nombre;
    private int nacimiento;
    private int num_camiseta;
    private int num_pos;
    private int cant_partidos;
    private int goles;

    public Jugador() {
    }

    public Jugador(String nombre, int nacimiento, int num_camiseta, int num_pos, int cant_partidos, int goles) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.num_camiseta = num_camiseta;
        this.num_pos = num_pos;
        this.cant_partidos = cant_partidos;
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public int getNum_camiseta() {
        return num_camiseta;
    }

    public int getNum_pos() {
        return num_pos;
    }

    public int getCant_partidos() {
        return cant_partidos;
    }

    public int getGoles() {
        return goles;
    }
}
