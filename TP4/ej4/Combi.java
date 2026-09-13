public class Combi extends Vehiculo {

    /**
     * precondiciones: dias > 0
     *
     *postcondiciones: el valor retornado es igual o mayor a la tarifa base (500)
     *
     * return: retorna el valor del alquiler
     */

    public Combi(String patente, int plazas) {
        super(patente);
        this.plazas = plazas;
    }

    private int plazas;

    @Override
    public double calculoAlquiler(int dias){
        return base + (1.0 + (0.02 * plazas));
    }
}
