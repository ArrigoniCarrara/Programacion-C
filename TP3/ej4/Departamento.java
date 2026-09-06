import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public Departamento(String nombre, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void getPlanilla(){
        for(Empleado e: empleados){
           System.out.println(e.getNombre()  + " Sueldo: " + e.getSueldoNeto() + "$");
        }
        System.out.println("--------------------------------------------------");
    }
}
