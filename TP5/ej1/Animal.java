public class Animal implements Emisor_de_Sonido{
    private String nombre;
    private int esperanza_de_vida;

    public Animal(String nombre, int esperanza_de_vida) {
        this.nombre = nombre;
        this.esperanza_de_vida = esperanza_de_vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEsperanza_de_vida() {
        return esperanza_de_vida;
    }

    public void setEsperanza_de_vida(int esperanza_de_vida) {
        this.esperanza_de_vida = esperanza_de_vida;
    }


    public void EmiteSonido() {
        System.out.println("Emito Sonido");
    }
}
