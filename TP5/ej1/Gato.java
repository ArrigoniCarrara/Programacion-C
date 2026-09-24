public class Gato extends Animal implements Emisor_de_Sonido{

    public Gato(String nombre, int esperanza_de_vida) {
        super(nombre, esperanza_de_vida);
    }

    public void EmiteSonido(){
        System.out.println("miau miau miau");
    }
}
