public class DatoCargaInvalido {
    private double cantidad_combustible;
    private double cantidad_Requerida;
    private String combustible;

    public DatoCargaInvalido(String combustible, double cantidad_combustible, double cantidad_Requerida ) {
        this.combustible = combustible;
        this.cantidad_combustible = cantidad_combustible;
        this.cantidad_Requerida = cantidad_Requerida;
    }

    public double getCantidad_combustible() {
        return cantidad_combustible;
    }

    public double getCantidad_Requerida() {
        return cantidad_Requerida;
    }

    public String getCombustible() {
        return combustible;
    }
}
