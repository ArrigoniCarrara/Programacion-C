public class Camion extends Vehiculo {
    /**
     * precondiciones: dias > 0
     *
     *postcondiciones: el valor retornado es igual o mayor a la tarifa base (500)
     *
     * return: retorna el valor del alquiler
     */

    private double pma;

    public Camion(String patente, double pma) {
        super(patente);
        this.pma = pma;
    }

    @Override
    public double calculoAlquiler(int dias){
        return (base * dias) * 1.40 + (1.0 + (0.2 * pma));
    }
}
