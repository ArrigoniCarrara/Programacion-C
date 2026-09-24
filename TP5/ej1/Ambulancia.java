public class Ambulancia extends Vehiculo implements Emisor_de_Sonido {

    public Ambulancia(String patente, String num_chasis, String num_motor) {
        super(patente, num_chasis, num_motor);
    }

    public void EmiteSonido(){
        System.out.println("wiuu wiuuu wiuuuuu");
    }
}
