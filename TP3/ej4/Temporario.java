public class Temporario extends Empleado{
    private double sueldo_hora;
    private int cant_horas;

    public Temporario(String nombre, int legajo, String domicilio, double sueldo_hora, int cant_horas) {
        super(nombre, legajo, domicilio);
        this.sueldo_hora = sueldo_hora;
        this.cant_horas = cant_horas;
    }

    @Override
    public double getSueldoNeto(){
          return sueldo_hora * cant_horas;
    }

    public double getSueldo_hora() {
        return sueldo_hora;
    }

    public int getCant_horas() {
        return cant_horas;
    }
}
