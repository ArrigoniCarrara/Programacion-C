//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mostrador mostrador = new Mostrador("Mostrador - Pepe");

        Thread p1 = new Thread(new Persona("Juan", 0, mostrador));
        Thread p2 = new Thread(new Persona("Patricio", 1, mostrador));
        Thread p3 = new Thread(new Persona("Manuel", 2, mostrador));
        Thread p4 = new Thread(new Persona("Ramon", 3, mostrador));

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}