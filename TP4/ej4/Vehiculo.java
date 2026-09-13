public abstract class Vehiculo {
    /**
     * precondiciones: dias > 0
     *
     *postcondiciones: el valor retornado es igual o mayor a la tarifa base (500)
     *
     * return: retorna el valor del alquiler de cualquier tipo de vehiculo
     */



    protected String patente;
    protected static double base = 500;

    public Vehiculo(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public abstract double calculoAlquiler(int dias);
}
