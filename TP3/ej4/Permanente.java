public abstract class Permanente extends Empleado{
    private double sueldo_base;
    private int antiguedad;
    protected final double aporte = 0.11;
    protected final double obra_social = 0.06;

    public Permanente(String nombre, int legajo, String domicilio, double sueldo_base, int antiguedad) {
        super(nombre, legajo, domicilio);
        this.sueldo_base = sueldo_base;
        this.antiguedad = antiguedad;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    @Override
    public double getSueldoNeto() {
        return getSueldoBruto() * (1 - (aporte + obra_social));
    }

    public abstract double getSueldoBruto();
}
