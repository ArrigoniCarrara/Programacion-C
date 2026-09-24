public class Madera extends Material{
    protected String tipo;

    public Madera(String color, String tipo){
        super(color);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String trabajoJuguetero(Juguetero juguetero) {
        return juguetero.getNombre() + " fabricó un Muñequito";
    }

    @Override
    public String trabajoJoyero(Joyero joyero) {
        return joyero.getNombre() + " fabricó un Par de Aros";
    }
}
