public class Auto extends Vehiculo {
    /**
     * precondiciones: dias > 0
     *
     *postcondiciones: el valor retornado es igual o mayor a la tarifa base (500)
     *
     * return: retorna el valor del alquiler
     */
    private int plazas;

    public Auto(String patente,int plazas) {
        super(patente);
        this.plazas = plazas;
    }

    @Override
    public double calculoAlquiler(int dias){
        return base * (1.0 + (0.015 * plazas));
    }
}
