public class Experto extends Permanente{

    public Experto(String nombre, int legajo, String domicilio, double sueldo_base, int antiguedad) {
        super(nombre, legajo, domicilio, sueldo_base, antiguedad);
    }

    @Override
    public double getSueldoBruto() {
        return getSueldo_base() * (1 + (getAntiguedad() * 0.015 + 0.5));
    }
}
