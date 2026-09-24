public class Metal extends Material{
    protected String nombre;

    public Metal(String color, String nombre) {
        super(color);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String trabajoJuguetero(Juguetero juguetero) {
        return juguetero.getNombre() + " fabricó un Autito";
    }

    @Override
    public String trabajoJoyero(Joyero joyero) {
        return joyero.getNombre() + " fabricó un Anillo";
    }
}
