public class Intermedio extends Permanente{

    public Intermedio(String nombre, int legajo, String domicilio, double sueldo_base, int antiguedad) {
        super(nombre, legajo, domicilio, sueldo_base, antiguedad);
    }

    @Override
    public double getSueldoBruto() {
        double aux = 0;
        double ant = getAntiguedad();
        if(ant != 0)
            aux = ant/100;

        return getSueldo_base() * (1 + (aux + 0.25));
    }
}
