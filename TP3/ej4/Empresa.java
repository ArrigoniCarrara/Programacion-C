import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Departamento> departamentos = new ArrayList<>();
    private static Empresa Instancia = null;

    private Empresa(String nombre, ArrayList<Departamento> departamentos) {
        this.nombre = nombre;
        this.departamentos = departamentos;
    }

    public static Empresa getInstancia(String nombre, ArrayList<Departamento> departamentos){
            if(Instancia == null)
                Instancia = new Empresa(nombre, departamentos);
            return Instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void getPlanillaEmpresa(){
        System.out.println("PLanilla Informativa de la empresa " + nombre + ":");
        for (Departamento d: departamentos ){
            System.out.println("Departamento " + d.getNombre());
            d.getPlanilla();
        }
    }
}
