import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ReflectiveOperationException {
        ArrayList<Empleado> empleadosMantenimiento = new ArrayList<>();
        empleadosMantenimiento.add(
                new Intermedio("Juan Perez", 1234, "Matheu 2343", 12000, 7));
        empleadosMantenimiento.add(
                new Temporario("Julio Garcia", 3209, "Colon 5561", 80, 160));
        empleadosMantenimiento.add(
                new Temporario("Martin Rodriguez", 3210, "Mitre 3451", 70, 100));

        ArrayList<Empleado> empleadosContabilidad = new ArrayList<>();
        empleadosContabilidad.add(
                new Experto("Mara Anchorena", 9876, "Luro 3489", 13000, 18));
        empleadosContabilidad.add(
                new Principiante("Sandra Fernandez", 1276, "Cordoba 3843", 11500, 6));
        empleadosContabilidad.add(
                new Principiante("Luis Gomez", 1544, "Formosa 2354", 10500, 2));
        // El enunciado no indica el sueldo base de Lucas; se toma $12.000.
        empleadosContabilidad.add(
                new Intermedio("Lucas Benitez", 1634, "Castelli 4563", 12000, 12));

        Departamento mantenimiento =
                new Departamento("Mantenimiento", empleadosMantenimiento);
        Departamento contabilidad =
                new Departamento("Contabilidad", empleadosContabilidad);

        ArrayList<Departamento> departamentos = new ArrayList<>();
        departamentos.add(mantenimiento);
        departamentos.add(contabilidad);


        Empresa empresa = Empresa.getInstancia("Empresa Ficticia", departamentos);

        empresa.getPlanillaEmpresa();
    }
}
