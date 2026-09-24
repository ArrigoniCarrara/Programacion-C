public class Perro extends Animal implements Emisor_de_Sonido{

    public Perro(String nombre, int esperanza_de_vida) {
        super(nombre, esperanza_de_vida);
    }

    public void EmiteSonido(){
        System.out.println("guau guau guau");
    }
}
