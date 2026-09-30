public class Animal implements Cloneable{

    private int esperanza_de_vida;
    private String nombre;

    public Animal() {
    }

    public Animal(int esperanza_de_vida, String nombre) {
        this.esperanza_de_vida = esperanza_de_vida;
        this.nombre = nombre;
    }

    public int getEsperanza_de_vida() {
        return esperanza_de_vida;
    }

    public void setEsperanza_de_vida(int esperanza_de_vida) {
        this.esperanza_de_vida = esperanza_de_vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            Animal clon = (Animal)super.clone();
            return clon;
        }
        catch (CloneNotSupportedException e){
            System.out.println("No se puede clonar");
            return null;
        }
    }
}
