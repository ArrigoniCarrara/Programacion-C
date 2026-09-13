import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> flota = new ArrayList<>();

        flota.add(new Auto("ABC123AA", 5));       // Auto de 5 plazas
        flota.add(new Auto("DEF456BB", 4));       // Auto compacto de 4 plazas
        flota.add(new Combi("GHI789CC", 12));     // Combi de 12 plazas
        flota.add(new Combi("JKL012DD", 19));     // Combi grande de 19 plazas
        flota.add(new Auto("MNO345EE", 7));       // Monovolumen de 7 plazas
        
        flota.add(new Camionetas("PQR678FF", 1.5)); // Carga con 1.5 toneladas
        flota.add(new Camionetas("STU901GG", 3.0)); // Carga pesada con 3.0 toneladas
        flota.add(new Camion("VWX234HH", 5.0));         // Camión con 5.0 toneladas
        flota.add(new Camion("YZA567II", 10.0));        // Camión pesado con 10.0 toneladas
        flota.add(new Camionetas("BCD890JJ", 2.0)); // Carga con 2.0 toneladas

        // Cantidad de días de alquiler de prueba (por ejemplo, 5 días)
        int diasAlquiler = 5;

        System.out.println("--- LISTADO DE PRECIOS DE ALQUILER (" + diasAlquiler + " DÍAS) ---");

        for (Vehiculo v : flota) {
            double costoTotal = v.calculoAlquiler(diasAlquiler);
            System.out.println("Patente: " + v.getPatente() +
                    " | Tipo: " + v.getClass().getSimpleName() + " | Costo Total: $" + costoTotal);
        }
    }
}

