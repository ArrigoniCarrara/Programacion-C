public class Joyero extends Artesano{
    public Joyero(String nombre) {
        super(nombre);
    }

    @Override
    public String trabajar(Material material) {
        return material.trabajoJoyero(this);
    }
}
