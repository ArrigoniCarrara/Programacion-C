public class Principiante extends Permanente{

    public Principiante(String nombre, int legajo, String domicilio, double sueldo_base, int antiguedad) {
        super(nombre, legajo, domicilio, sueldo_base, antiguedad);
    }

    @Override
    public double getSueldoBruto(){
        double plus = 0;

        if(getAntiguedad() >= 2) {
            if (getAntiguedad() < 5)
                   plus = 0.05;
            else if (getAntiguedad() >= 5 && getAntiguedad() < 10)
                        plus = 0.07;
            else if (getAntiguedad() >= 10 && getAntiguedad() < 15)
                        plus = 0.1;
            else if (getAntiguedad() >= 15 && getAntiguedad() < 20)
                        plus = 0.15;
            else
                plus = 0.2;
        }
        return getSueldo_base() * (1 + plus);
    }
}
