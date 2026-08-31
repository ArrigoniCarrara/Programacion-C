public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACION DE LA AGENDA ===");

        Agenda agenda = new Agenda();

        System.out.println("\nEstado inicial:");
        agenda.mostrarContactos();

        System.out.println("\n1) agenda.agregarContacto(\"Ana\", \"1111\")");
        agenda.agregarContacto("Ana", "1111");
        agenda.mostrarContactos();

        System.out.println("\n2) agenda.agregarContacto(\"Luis\", \"2222\")");
        agenda.agregarContacto("Luis", "2222");
        agenda.mostrarContactos();

        System.out.println("\n3) agenda.agregarContacto(\"Ana\", \"9999\")");
        agenda.agregarContacto("Ana", "9999");
        agenda.mostrarContactos();

        System.out.println("\n4) agenda.buscarContacto(\"Ana\")");
        agenda.buscarContacto("Ana");

        System.out.println("\n5) agenda.eliminarContacto(\"Luis\")");
        agenda.eliminarContacto("Luis");
        agenda.mostrarContactos();

        System.out.println("\n6) agenda.buscarContacto(\"Luis\")");
        agenda.buscarContacto("Luis");
    }
}
