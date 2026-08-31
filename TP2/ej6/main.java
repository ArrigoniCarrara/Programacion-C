import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Surtidor surtidor1 = new Surtidor(1000);
        Surtidor surtidor2 = new Surtidor(1200);
        Surtidor surtidor3 = new Surtidor(800);
        Surtidor surtidor4 = new Surtidor(1500);
        Surtidor surtidor5 = new Surtidor(1000);

        ArrayList<Surtidor> surtidores = new ArrayList<>();
        surtidores.add(surtidor1);
        surtidores.add(surtidor2);
        surtidores.add(surtidor3);
        surtidores.add(surtidor4);
        surtidores.add(surtidor5);

        Estacion estacion = new Estacion("Estacion Central", surtidores);

        System.out.println("=== Estado inicial ===");
        System.out.println("Estacion: Estacion Central");
        System.out.println("Cantidad de surtidores: " + estacion.cantidad_surtidores());
        System.out.println("Gasoil total: " + estacion.totalGasoil() + " litros");
        System.out.println("Super total: " + estacion.totalSuper() + " litros");
        System.out.println("Premium total: " + estacion.totalPremium() + " litros");

        System.out.println("\n=== Carga de combustible ===");
        System.out.println("Surtidor 1 - Gasoil: " + surtidor1.extraerGasoil(300) + " (300 litros)");
        System.out.println("Surtidor 2 - Super: " + surtidor2.extraerSuper(500) + " (500 litros)");
        System.out.println("Surtidor 3 - Premium: " + surtidor3.extraerPremium(700) + " (700 litros)");
        System.out.println("Surtidor 4 - Gasoil: " + surtidor4.extraerGasoil(900) + " (900 litros)");
        System.out.println("Surtidor 4 - Gasoil: " + surtidor4.extraerGasoil(800) + " (800 litros)");
        System.out.println("Surtidor 4 - Super: " + surtidor4.extraerSuper(650) + " (650 litros)");
        System.out.println("Surtidor 5 - Premium: " + surtidor5.extraerPremium(250) + " (250 litros)");

        System.out.println("\n=== Estado luego de las ventas ===");
        System.out.println("Gasoil total restante: " + estacion.totalGasoil() + " litros");
        System.out.println("Super total restante: " + estacion.totalSuper() + " litros");
        System.out.println("Premium total restante: " + estacion.totalPremium() + " litros");
        System.out.println("Litros Vendidos: " + estacion.cantlitrosVendidosEstacion());

        System.out.println("\n=== Mejores surtidores por combustible ===");
        System.out.println("Mayor cantidad de gasoil: "
                + estacion.mejorSurtidorGasoil().getCantGasoil() + " litros)");
        System.out.println("Mayor cantidad de super: "
                + estacion.mejorSurtidorSuper().getCantSuper() + " litros)");
        System.out.println("Mayor cantidad de premium: "
                + estacion.mejorSurtidorPremium().getCantPremium() + " litros)");

        System.out.println("\n=== Reposicion de depositos ===");
        surtidor3.llenarDepositoGasoil();
        surtidor3.llenarDepositoSuper();
        surtidor3.llenarDepositoPremium();
        System.out.println("Surtidor 3 repuesto: " + surtidor3.getCantGasoil()
                + " litros de cada combustible");
    }
}
