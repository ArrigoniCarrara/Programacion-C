public abstract class Artesano {
    private String nombre;

    public Artesano(String nombre) {
        this.nombre = nombre;
    }

    public abstract String trabajar(Material material);

    public String getNombre() {
        return nombre;
    }
}
