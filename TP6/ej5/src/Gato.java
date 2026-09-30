public class Gato extends Animal implements Cloneable {

    public Gato() {
    }

    public Gato(int esperanza_de_vida, String nombre) {
        super(esperanza_de_vida, nombre);
    }

    @Override
    public Object clone(){
        try{
            Gato clon = (Gato)super.clone();
            return clon;
        }
        catch(CloneNotSupportedException e){
            System.err.println("No se puede clonar");
            return null;
        }
    }
}
