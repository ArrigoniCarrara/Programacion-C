public abstract class Material {
    protected String color;

    public Material(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String trabajoJuguetero(Juguetero juguetero);

    public abstract String trabajoJoyero(Joyero joyero);
}
