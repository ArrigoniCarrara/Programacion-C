import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Animal("Pablo", 5));
        animales.add(new Gato("Paco", 10));
        animales.add(new Gato("Ermenegildo", 9));
        animales.add(new Perro("Einstein", 15));
        animales.add(new Perro("Juan", 12));

        for (Animal a: animales){
            System.out.println("Soy "+ a.getNombre());
            a.EmiteSonido();
        }
        Vehiculo vehiculo = new Ambulancia("p", "p", "p");
        vehiculo.EmiteSonido();
    }
}