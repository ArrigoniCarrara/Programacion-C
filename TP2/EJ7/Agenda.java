import java.util.HashMap;

public class Agenda {
    private HashMap<String, Contacto> contactos = new HashMap<>();

    public Agenda() {
    }

    public Agenda(HashMap<String, Contacto> contactos) {
        this.contactos = contactos;
    }

    public void agregarContacto(String nombre, String tel) {
        if (contactos.containsKey(nombre)) {
            System.out.println("El contacto ya existe");
        } else {
            contactos.put(nombre, new Contacto(nombre, tel));
        }
    }

    public void eliminarContacto(String nombre) {
        if (contactos.containsKey(nombre)) {
            contactos.remove(nombre);
        } else {
            System.out.println("El contacto no existe");
        }
    }

    public void buscarContacto(String nombre) {
        if (contactos.containsKey(nombre)) {
            Contacto c = contactos.get(nombre);
            System.out.println("Nombre: " + c.getNombre() + " | Telefono Fijo: " + c.getTel_fijo());
            System.out.println("Telefonos celulares: ");
            if (c.getTel_cel().isEmpty()) {
                System.out.println("- No tiene celulares cargados");
            } else {
                for (String t : c.getTel_cel()) {
                    System.out.println("- " + t);
                }
            }
        } else {
            System.out.println("El contacto no existe");
        }
    }

    public void mostrarContactos() {
        System.out.println("Contactos: ");
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía");
            return;
        }

        for (Contacto c : contactos.values()) {
            System.out.println("Nombre: " + c.getNombre() + " | Telefono Fijo: " + c.getTel_fijo());
            System.out.println("Telefonos celulares: ");
            if (c.getTel_cel().isEmpty()) {
                System.out.println("- No tiene celulares cargados");
            } else {
                for (String t : c.getTel_cel()) {
                    System.out.println("- " + t);
                }
            }
            System.out.println("--------------------------------------");
        }
    }
}
